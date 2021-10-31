<%@ page pageEncoding="utf-8"%>
<%@ include file="/common/taglib.jsp" %>
<!DOCTYPE html> 
<html> 
<head>
    <title>Account | HDC Store</title>
    <%@ include file="/common/head.jsp" %>

    
</head> 

<body> 
   
    <!-- ------------Account-page------------------- -->
    <div class="account-page">
        <div class="container">
            <div class="row">
                <div class="col-2">
                    <img src="images/image1.png" width="100%">
                </div>

                <div class="col-2">
                    <div class="form-container">
                    	
                       <div class="form-btn">
                            <span onclick="login()">Login</span>
                            <span onclick="register()">Register</span>
                            <hr id="Indicator">
                        </div>
						${message}
                        <form:form action="account/login.htm" method="post" id="LoginForm" modelAttribute="login">
                            <form:input path="accountName" type="text" placeholder="Accountname"/>
                            <form:errors path="accountName" style="color:red;"/>
                            
                            <form:input path="password" type="password" placeholder="Password"/>
                            <form:errors path="password" style="color:red;"/>
                            
                            <button type="submit" class="btn">Login</button>
                            <a href="account/forgetPassword.htm">Forgot password</a>
                        </form:form>
						

                        <form action="#" method="post" id="RegForm">
                        	<input type="email" placeholder="Email"/>
                        	
                        	<input type="password" placeholder="Email password"/>
                        	
                        	<input type="text" placeholder="Accountname"/>
                        	
                            <input type="text" placeholder="Password"/>
                            
                            <input type="password" placeholder="Confirm password"/>
                            
                            <button type="submit" class="btn">Register</button>
                        </form>
						
						
                    </div>
                </div>
            </div>
        </div>
    </div>
   
    <!-- ------------footer----------- -->
	<%@ include file="/common/footer.jsp" %>
    
        
        <!-- ------------------- js for Account form-------------- -->

        <script>
            var LoginForm = document.getElementById("LoginForm");
            var RegForm = document.getElementById("RegForm");
            var Indicator = document.getElementById("Indicator");

            function register() {
                RegForm.style.transform = "translateX(-300px)";
                LoginForm.style.transform = "translateX(-300px)";
                Indicator.style.transform = "translateX(70px)";

            }
            function login() {
                RegForm.style.transform = "translateX(0px)";
                LoginForm.style.transform = "translateX(0px)";
                Indicator.style.transform = "translateX(0px)";
            }
        </script>
</body>
</html>