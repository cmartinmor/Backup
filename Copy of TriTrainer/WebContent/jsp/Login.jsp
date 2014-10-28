<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html>
<html lang="en">
  <head>
    <meta charset="utf-8">
    <title>Login</title>
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta name="description" content="">
    <meta name="author" content="">
    
    <!-- Le JS -->
    <script type="text/javascript" src="../js/jquery.min.js"></script>
    <script type="text/javascript" src="../js/bootstrap.min.js"></script>
    <script type="text/javascript" src="../js/ladda.js"></script>
    <script type="text/javascript" src="../js/login.js"></script>

    <!-- Le styles -->
    <link href="../css/bootstrap.css" rel="stylesheet" type="text/css" />
    <link href="../css/login.css" rel="stylesheet" type="text/css" />
    <link href="../css/bootstrap-responsive.css" rel="stylesheet" type="text/css" />
    <link href="../css/ladda.css" rel="stylesheet" type="text/css" />

    <!-- HTML5 shim, for IE6-8 support of HTML5 elements -->
    <!--[if lt IE 9]>
      <script src="Scripts/html5shiv.js"></script>
    <![endif]-->
    </head>

    <body>
        <div class="container">
        <s:actionerror />
		<s:form action="login.action" method="post" theme="simple">
        
            <div class="form-signin">
                <img src="../images/logo2.png">
               <div id="form-signin">              
                    <s:textfield name="username" key="label.username" cssClass="form-control " placeholder="Username" label="User"></s:textfield>				
                    <s:password name="password" key="label.password" cssClass="form-control" placeholder="Password" label="Pass"></s:password>
                    
                    <s:submit type="button" method="execute" key="label.login" cssClass="btn btn-lg btn-primary btn-block" >
					         
						</s:submit>	
					
					
                </div>

                <div id="form-forgot" style="display: none">
                    <input id="rec-email" class="input-block-level" name="Email" type="text" placeholder="Email">
                    <button id="btnForgotCancel" class="btn btn-inverse">Cancel</button>
                    <button id="btnForgotSend" class="btn btn-danger ladda-button zoom-out">
                        <span class="ladda-label">Recover</span>
                        <span class="ladda-spinner"></span>
                        <div class="ladda-progress" style="width: 0px;"></div>
                    </button>
                </div>
            </div>
            <div id="well" class="well well-small">
                <p style="margin: 0">Don't have an account? <strong><a href="Registro.jsp">Register now!</a></strong></p>
            </div>
            <p id="copyright">&copy; Company Name - <a id="btnForgot">Forgot your password?</a></p>
           </s:form>
        </div> <!-- /container -->

        <script>
            // Bind normal buttons
            Ladda.bind( '.ladda-button', { timeout: 1000 } );
        </script>

    </body>
</html>