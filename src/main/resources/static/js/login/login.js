$(function(){
    console.log('==login.js start');

    $('#btnLoginModal1').click(function () {
        console.log('== name btnLoginModal1');
        pageInit();
    });
    $('#btnLoginModal2').click(function () {
        console.log('== name btnLoginModal2');
        pageInit();
    });

    $('#btnRegister').click(function () {
       console.log('==btnRegister click');
       fn_run('save');
    });

    $('#btnLogin').click(function () {
        console.log('==btnLogin click');
        fn_run('login');
    });

    function fn_run(cmd){
        console.log('== fn_run');
        if(!fn_valid(cmd)){
            return;
        }

        switch (cmd) {
            case 'save':
                console.log('switch save');
                var registerName = $('#registerName').val(); // name
                var registerEmail = $('#registerEmail').val(); // email
                var registerPassword = $('#registerPassword').val(); // password
                console.log('==registerName: ' + registerName + ',registerEmail: ' + registerEmail + ',registerPassword: ' + registerPassword);

                var param = {
                    'registerName': registerName,
                    'registerEmail': registerEmail,
                    'registerPassword': registerPassword
                };

                console.log("==param: " + param);
                $.ajax({
                    type:"post",
                    url:"/login/register.do",
                    data: param,
                    dataType:'json',
                    success: function(data, status, xhr){
                        console.log('ajax success: ' + JSON.stringify(data) + ", status: " + status + ", xhr: " + xhr);
                        console.log('result: ' + data.result);
                        alert('회원 등록 완료 되었습니다.');
                        window.location.href = '/';
                    },
                    error: function(err){
                        console.log('ajax error: ' + JSON.stringify(err));
                        alert('회원 등록 실패 되었습니다.');
                    }
                });

                break;
            case 'login':
                console.log('switch login');
                var loginEmail = $('#loginEmail').val(); // email
                var loginPassword = $('#loginPassword').val(); // password

                var param = {
                    'loginEmail': loginEmail,
                    'loginPassword': loginPassword
                };
                console.log("==param: " + param);

                $.ajax({
                    type:"post",
                    url:"/login/login.do",
                    data: param,
                    dataType:'json',
                    success: function(data, status, xhr){
                        console.log('ajax success: ' + JSON.stringify(data) + ", status: " + status + ", xhr: " + xhr);
                        console.log('result: ' + data.result);
                        alert('로그인 완료 되었습니다.');
                        window.location.href = '/';
                    },
                    error: function(err){
                        console.log('ajax error: ' + JSON.stringify(err));
                        alert('로그인 실패 되었습니다.');
                    }
                });

                break;
            default:
                console.log('switch default');
                break;
        }
    }

    function fn_valid(cmd){
        console.log('==fn_valid');

        var registerName = $('#registerName').val(); // name
        var registerEmail = $('#registerEmail').val(); // email
        var registerPassword = $('#registerPassword').val(); // password
        var loginEmail = $('#loginEmail').val(); // email
        var loginPassword = $('#loginPassword').val(); // password

        switch (cmd) {
            case 'save':
                if(registerName == '' || registerName == null){
                    alert('Please input name');
                    $('#registerName').focus;
                    return false;
                }else if(registerEmail == '' || registerEmail == null){
                    alert('Please input email');
                    $('#registerEmail').focus;
                    return false;
                }else if(registerPassword == '' || registerPassword == null){
                    alert('Please input password');
                    $('#registerPassword').focus;
                    return false;
                }else{
                    return true;
                }
                break;
            case 'login':
                if(loginEmail == '' || loginEmail == null){
                    alert('Please input email');
                    $('#loginEmail').focus;
                    return false;
                }else if(loginPassword == '' || loginPassword == null){
                    alert('Please input password');
                    $('#loginPassword').focus;
                    return false;
                }else{
                    return true;
                }
                break;
            default:
                break;
        }
    }

    function pageInit(){
        // 텍스트 창 초기화
        console.log('==pageInit()');
        // Login
        $('#loginEmail').val('');
        $('#loginPassword').val('');

        // Register
        // registerName
        $('#registerName').val('');
        console.log($('#registerName').val());
        // registerEmail
        $('#registerEmail').val('');
        console.log($('#registerEmail').val());
        // registerPassword
        $('#registerPassword').val('');
        console.log($('#registerPassword').val());
    }
/*

    $('#btnFacebookLogin').click(function(){
        console.log('==btnFacebookLogin click');
        checkLoginState();
        //getUserData();
    });

    function checkLoginState() {               // Called when a person is finished with the Login Button.
        console.log('==checkLoginState()');
        FB.getLoginStatus(function(response) {   // See the onlogin handler
            console.log('==FB.getLoginStatus');
            statusChangeCallback(response);
        });
    }

    function statusChangeCallback(response) {  // Called with the results from FB.getLoginStatus().
        console.log('==statusChangeCallback');
        console.log(response);                   // The current login status of the person.
        if (response.status === 'connected') {   // Logged into your webpage and Facebook.
            testAPI();
        } else {                                 // Not logged into your webpage or we are unable to tell.
            //document.getElementById('status').innerHTML = 'Please log ' + 'into this webpage.';
            console.log('login false');
        }
    }

    function testAPI() {                      // Testing Graph API after login.  See statusChangeCallback() for when this call is made.
        console.log('Welcome!  Fetching your information.... ');
        FB.api('/me', function(response) {
            console.log('Successful login for: ' + response.name);
            //document.getElementById('status').innerHTML = 'Thanks for logging in, ' + response.name + '!';
        });
    }

    window.fbAsyncInit = function() {
        FB.init({
            appId      : '161671948210067',
            cookie     : true,                     // Enable cookies to allow the server to access the session.
            xfbml      : true,                     // Parse social plugins on this webpage.
            version    : 'v6.0'           // Use this Graph API version for this call.
        });

        FB.getLoginStatus(function(response) {   // Called after the JS SDK has been initialized.
            statusChangeCallback(response);        // Returns the login status.
        });
    };


        (function(d, s, id) {                      // Load the SDK asynchronously
            var js, fjs = d.getElementsByTagName(s)[0];
            if (d.getElementById(id)) return;
            js = d.createElement(s); js.id = id;
            js.src = "https://connect.facebook.net/ko_KR/sdk.js#xfbml=1&version=v6.0&appId=161671948210067&autoLogAppEvents=1";
            fjs.parentNode.insertBefore(js, fjs);
        }(document, 'script', 'facebook-jssdk'));

*/


});



/*
function getUserData(){
    FB.api('/me', {fields: 'name,email'}, function(response) {

        var facebookname = response.name;
        window.location.replace("http://" + window.location.hostname + ( (location.port==""||location.port==undefined)?"":":" + location.port) + "/hansub_project/home?facebookname="+facebookname);
    });
}

window.fbAsyncInit = function() {
    FB.init({
        appId      : '161671948210067',
        cookie     : true,
        xfbml      : true,
        version    : 'v6.0'
    });

    FB.AppEvents.logPageView();

};

(function(d, s, id){
    var js, fjs = d.getElementsByTagName(s)[0];
    if (d.getElementById(id)) {return;}
    js = d.createElement(s); js.id = id;
    js.src = "https://connect.facebook.net/en_US/sdk.js";
    fjs.parentNode.insertBefore(js, fjs);
}(document, 'script', 'facebook-jssdk'));

document.getElementById('btnFacebookLogin').addEventListener('click', function () {
    FB.login(function (response) {
        if(response.authResponse){
            access_token = response.authResponse.accessToken; //get access token
            user_id = response.authResponse.userID; //get FB UID
            console.log('access_token = '+access_token);
            console.log('user_id = '+user_id);
            getUserData();
        }
    }, {scope: 'email,public_profile,user_birthday',
        return_scopes: true});
}, false);
*/

function facebookRegister(){
    alert('Facebook Register');
}

function googleRegister(){
    alert('Google Register');
}
