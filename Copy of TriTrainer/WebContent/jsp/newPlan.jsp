<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html>
<html>

<head>
<meta charset='utf-8' />
<meta http-equiv="X-UA-Compatible" content="chrome=1" />
<meta name="description"
	content="Bootstrap datetimepicker : Date/time picker widget for Twitter Bootstrap v3" />
<link href="../css/signin.css" rel="stylesheet">


<link rel="stylesheet" type="text/css" media="screen"
	href="../css/siteBorrar.css" />
<link rel="stylesheet" type="text/css" media="screen"
	href="../css/bootstrap-datetimepicker.css" />
<link rel="stylesheet" type="text/css" media="screen"
	href="../css/pygments-manni.css" />
<link
	href="//netdna.bootstrapcdn.com/font-awesome/4.0.1/css/font-awesome.css"
	rel="stylesheet">
	<link rel="stylesheet" type="text/css" href="../css/fonts.css" />


<script type="text/javascript"
	src="//cdnjs.cloudflare.com/ajax/libs/jquery/2.0.3/jquery.min.js"></script>
<link rel='stylesheet' href='../css/style.css'>

		


<title>Lets create your Plan</title>
</head>

<body>

	<div id="page-wrap" class="container">
		<s:actionerror />
		<div class="row">
			<div class="col-xs-2 col-sm-2 col-md-2" ></div>
			<div class="col-xs-4 col-sm-4 col-md-4">
				<s:form action="nuevo.action" method="post" theme="simple"
					id="contact-form">
					 <div class="form-signin">
<!-- 					<div class="row"> -->
<!-- 					<div id="content"> -->
<!-- 						<h2>Lets make a new training</h2> -->
<!-- 					</div> -->
<!-- 					</div> -->
<!-- 					<br> -->

					<div class="row">
						<div class="col-xs-8 col-sm-8 col-md-8">
							<b>Pick a distance</b>
							<div class="form-group">
								<select name="distance" class="form-control input-lg"
									title="Pick your distance">
									<option value=1>Sprint</option>
									<option value=2>Olimpic</option>
									<option value=3>Half IM</option>
									<option value=4>IM</option>
								</select>
							</div>

						</div>

					</div>
					<b>Race date</b>
					<div class="row">
						<div class="col-xs-8 col-sm-8 col-md-8">

							<div class="form-group">
								<div class='input-group date' id='datetimepicker1'>
									<s:textfield cssClass="form-control input-lg" name="fecha"/> <span
										class="input-group-addon"><span
										class="fa fa-calendar"></span> </span>
								</div>
							</div>
						</div>
						<script type="text/javascript">
						$(function () {
			                $('#datetimepicker1').datetimepicker({
			                    language: 'es'
			                });
			            });
						</script>
					</div>
					<b>Best time in swimming sector* </b>
					<div class="row">

						<div class="col-xs-3 col-sm-3 col-md-3">



							<s:textfield name="horasSwim" key="label.first_name"
								required="true" cssClass="form-control input-lg"
								placeholder="HH" label="" tabindex="1" />


						</div>
						<div class="col-xs-3 col-sm-3 col-md-3">

							<s:textfield name="minutosSwim" key="label.last_name"
								required="true" cssClass="form-control input-lg"
								placeholder="MM" tabindex="2" />

						</div>
					</div>
					<br>
					<b>Best time in cycling sector *</b>
					<div class="row">

						<div class="col-xs-3 col-sm-3 col-md-3">



							<s:textfield name="horasCycle" key="label.first_name"
								required="true" cssClass="form-control input-lg"
								placeholder="HH" label="" tabindex="1" />


						</div>
						<div class="col-xs-3 col-sm-3 col-md-3">

							<s:textfield name="minutosCycle" key="label.last_name"
								required="true" cssClass="form-control input-lg"
								placeholder="MM" tabindex="2" />

						</div>
					</div>
					<br>
					<b >Best time in running sector *</b>
					<div class="row">

						<div class="col-xs-3 col-sm-3 col-md-3">



							<s:textfield name="horasRun" key="label.first_name"
								required="true" cssClass="form-control input-lg"
								placeholder="HH" label="" tabindex="1" />


						</div>
						<div class="col-xs-3 col-sm-3 col-md-3">

							<s:textfield name="minutosRun" key="label.last_name"
								required="true" cssClass="form-control input-lg"
								placeholder="MM" tabindex="2" />

						</div>
					</div>
					<br>
					<mark>* In case that it is your debut double the time in the previous category.</mark>
					
					<br><br>
					<div class="row">
						<div class="col-xs-6 col-md-6">
							<s:submit method="execute" key="label.Save"
								cssClass="btn btn-primary btn-block btn-lg" value="Save" />
						</div>
						
					</div>
					</div>
				</s:form>
			</div>
			<div class="col-md-4">
			
			<div><img src="../images/pool.jpg" style="border-radius: 5px;margin-bottom: 5px;"></div>
			<div><img src="../images/bici.jpg" style="border-radius: 5px;margin-bottom: 5px;"></div>
			<div><img src="../images/zapatillas.jpg" style="border-radius: 5px;margin-bottom: 5px; "></div>
			</div>
			<div class="col-md-2" ></div>
			
		</div>

	</div>

	<script type="text/javascript" src="../js/bootstrap.min.js"></script>
	<script type="text/javascript" src="../js/moment.js"></script>

	<script type="text/javascript" src="../js/bootstrap-datetimepicker.js"></script>
	<script type="text/javascript" src="../js/bootstrap-datetimepicker.es.js"></script>

</body>
</html>
