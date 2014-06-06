
<!DOCTYPE HTML>
<html>
<head>
<meta charset="utf-8">
<title>Your Name Here - Welcome</title>
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<meta name="description" content="">
<meta name="author" content="">

<link href="../css/bootstrap.min.css" rel="stylesheet">
<link href="../css/bootstrap-responsive.min.css" rel="stylesheet">

<!-- Le HTML5 shim, for IE6-8 support of HTML5 elements -->
<!--[if lt IE 9]>
      <script src="http://html5shim.googlecode.com/svn/trunk/html5.js"></script>
    <![endif]-->

<link href="../css/custom.css" rel="stylesheet" type="text/css" />
<script src="../js/validation.js" type="text/javascript"></script>
</head>

<body>
	<div class="span8" id="divMain">

		<h1>Tell us what you think...</h1>
		<h3 style="color: #FF6633;">
			<?php echo $_GET[msg];?>
		</h3>
		<hr>
		<!--Start Contact form -->
		<form name="enq" method="post" action="email/"
			onsubmit="return validation();">

			<fieldset>
				<input type="text" name="name" id="name" value=""
					class="input-block-level" placeholder="Name" /> <input type="text"
					name="email" id="email" value="" class="input-block-level"
					placeholder="Email" />
				<textarea rows="11" name="message" id="message"
					class="input-block-level" placeholder="Comments"></textarea>
				<div class="actions">
					<input type="submit" value="Send Your Message" name="submit"
						id="submitButton" class="btn btn-info pull    -right"
						title="Click here to submit your message!" />
				</div>

			</fieldset>

		</form>
		<!--End Contact form -->
	</div>
	<!--/.container-->
	<script src="../js/jquery.min.js"></script>
	<script src="../js/bootstrap.min.js"></script>
	<script src="../js/contact-form.js"></script>
</body>
</html>