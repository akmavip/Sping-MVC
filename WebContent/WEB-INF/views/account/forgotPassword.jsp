<%@ page pageEncoding="utf-8"%>
<%@ include file="/common/taglib.jsp" %>
<!DOCTYPE html> 
<html> 
<head>
    <title>Forgot Password | Account | HDC Store</title>
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
                            Forgot Password
                        </div>
						${message}
                        <form:form action="account/forgetPassword.htm" method="post" modelAttribute="forgotPassword">
                        	
                        	<form:input path="email" type="email" placeholder="Email"/>
                        	<form:errors path="email"/>
                        	
                        	<form:input path="password" type="password" placeholder="Password Email"/>
                        	<form:errors path="password"/>
                        	
                        	
                            <button type="submit" class="btn">Submit</button>
                        </form:form>
						
                    </div>
                </div>
            </div>
        </div>
    </div>
   
    <!-- ------------footer----------- -->
	<%@ include file="/common/footer.jsp" %>

</body>
</html>