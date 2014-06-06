<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<meta name="description" content="">
<meta name="author" content="">

<title>TriTrainer</title>

<!-- Bootstrap core CSS -->
<link rel="stylesheet"
	href="https://fonts.googleapis.com/css?family=Open+Sans:400,600,800">
<link href="../css/bootstrap.css" rel="stylesheet">
<link href="../css/stats.css" rel="stylesheet">
<link href="../css/sb-admin.css" rel="stylesheet">
<link
	href="//netdna.bootstrapcdn.com/font-awesome/4.1.0/css/font-awesome.min.css"
	rel="stylesheet">
<!-- Page Specific CSS -->


<link rel="stylesheet"
	href="http://cdn.oesmith.co.uk/morris-0.4.3.min.css">
<script type="text/javascript" src="../js/jquery.min.js"></script>
<script type="text/javascript" src="../js/jquery.sparkline.js"></script>

<script type="text/javascript">
	/* <![CDATA[ */
	$(function() {
		/** This code runs when everything has been loaded on the page */
		/* Sparklines can also take their values from the first argument passed to the sparkline() function */
		var myvalues = [ 10, 8, 5, 7, 4, 4, 1 ];
		$('.dynamicsparkline').sparkline(myvalues);

		/* The second argument gives options such as specifying you want a bar chart */
		$('.dynamicbar').sparkline(myvalues, {
			type : 'bar',
			barColor : 'green'
		});

	});
	/* ]]> */
</script>

</head>

<body>

	<div>

		<!-- Sidebar -->
		<nav class="navbar navbar-inverse navbar-fixed-top" role="navigation">
			<!-- Brand and toggle get grouped for better mobile display -->
			<div class="navbar-header">
				<button type="button" class="navbar-toggle" data-toggle="collapse"
					data-target=".navbar-ex1-collapse">
					<span class="sr-only">Toggle navigation</span> <span
						class="icon-bar"></span> <span class="icon-bar"></span> <span
						class="icon-bar"></span>
				</button>
				<a class="navbar-brand" href="/TriTrainer">TriTrainer</a>
			</div>

			<!-- Collect the nav links, forms, and other content for toggling -->
			<div class="collapse navbar-collapse navbar-ex1-collapse">
				<!--           <ul class="nav navbar-nav side-nav"> -->
				<!--             <li class="active"><a href="index.html"><i class="fa fa-dashboard"></i> Dashboard</a></li> -->
				<!--             <li><a href="charts.html"><i class="fa fa-bar-chart-o"></i> Charts</a></li> -->
				<!--             <li><a href="tables.html"><i class="fa fa-table"></i> Tables</a></li> -->
				<!--             <li><a href="forms.html"><i class="fa fa-edit"></i> Forms</a></li> -->
				<!--             <li><a href="typography.html"><i class="fa fa-font"></i> Typography</a></li> -->
				<!--             <li><a href="bootstrap-elements.html"><i class="fa fa-desktop"></i> Bootstrap Elements</a></li> -->
				<!--             <li><a href="bootstrap-grid.html"><i class="fa fa-wrench"></i> Bootstrap Grid</a></li> -->
				<!--             <li><a href="blank-page.html"><i class="fa fa-file"></i> Blank Page</a></li> -->
				<!--             <li class="dropdown"> -->
				<!--               <a href="#" class="dropdown-toggle" data-toggle="dropdown"><i class="fa fa-caret-square-o-down"></i> Dropdown <b class="caret"></b></a> -->
				<!--               <ul class="dropdown-menu"> -->
				<!--                 <li><a href="#">Dropdown Item</a></li> -->
				<!--                 <li><a href="#">Another Item</a></li> -->
				<!--                 <li><a href="#">Third Item</a></li> -->
				<!--                 <li><a href="#">Last Item</a></li> -->
				<!--               </ul> -->
				<!--             </li> -->
				<!--           </ul> -->

				<ul class="nav navbar-nav navbar-right navbar-user">

					<li><a href="Registro.jsp"><i class="fa fa-youtube-play"></i>New Plan </a></li>
					<li class="dropdown user-dropdown"><a href="#"
						class="dropdown-toggle" data-toggle="dropdown"><i
							class="fa fa-user"></i> John Smith <b class="caret"></b></a>
						<ul class="dropdown-menu">
							<li><a href="Registro.jsp"><i class="fa fa-user"></i>
									Profile</a></li>
							<li><a href="#"><i class="fa fa-envelope"></i> Inbox <span
									class="badge">7</span></a></li>
							<li><a href="#"><i class="fa fa-gear"></i> Settings</a></li>
							<li class="divider"></li>
							<li><a href="Registro.jsp"><i class="fa fa-power-off"></i>
									Log Out</a></li>
						</ul></li>
				</ul>
			</div>
			<!-- /.navbar-collapse -->
		</nav>

		<div id="page-wrapper">

			<div class="row">
				<div class="col-lg-12">
					<h1>
						Training <small>Statistics Overview</small>
					</h1>
					<ol class="breadcrumb">
						<li class="active"><i class="fa fa-tasks"></i> Task</li>
					</ol>

				</div>
			</div>
			<!-- /.row -->

			<div class="row">
				<div class="col-lg-4">
					<div class="panel panel-info">
						<a href="#">
							<div class="panel-heading announcement-bottom">
								<div class="row">
									<div class="col-xs-6">Yesterday</div>
									<div class="col-xs-6 text-right">
										<i class="fa fa-arrow-circle-right"></i>
									</div>
								</div>
							</div>
						</a>
						<div class="panel-heading">
							<div class="row">
								<div class="col-xs-6">
									<i class="fa fa-comments fa-5x"></i>
								</div>
								<div class="col-xs-6 text-right">
									<p class="announcement-heading"></p>
									<p class="announcement-text">
										<td width="35%"><s:property value="triTUsuarios.usuario" /></td>
									</p>

								</div>
							</div>
						</div>

					</div>
				</div>
				<div class="col-lg-4">
					<div class="panel panel-warning">
						<a href="#">
							<div class="panel-heading announcement-bottom">
								<div class="row">
									<div class="col-xs-6">Today</div>
									<div class="col-xs-6 text-right">
										<i class="fa fa-arrow-circle-right"></i>
									</div>
								</div>
							</div>
						</a>
						<div class="panel-heading">
							<div class="row">
								<div class="col-xs-6">
									<i class="fa fa-check fa-5x"></i>
								</div>
								<div class="col-xs-6 text-right">
									<p class="announcement-heading">12</p>
									<p class="announcement-text">
										<td width="35%"><s:property value="triTUsuarios.usuario" />
									</p>
								</div>
							</div>
						</div>

					</div>
				</div>
				<div class="col-lg-4">
					<div class="panel panel-danger">
						<a href="#">
							<div class="panel-heading announcement-bottom">
								<div class="row">
									<div class="col-xs-6">Tomorrow</div>
									<div class="col-xs-6 text-right">
										<i class="fa fa-arrow-circle-right"></i>
									</div>
								</div>
							</div>
						</a>
						<div class="panel-heading">
							<div class="row">
								<div class="col-xs-6">
									<i class="fa fa-tasks fa-5x"></i>
								</div>
								<div class="col-xs-6 text-right">
									<p class="announcement-heading">18</p>
									<p class="announcement-text">
										<td width="35%"><s:property value="triTUsuarios.usuario" />
									</p>
								</div>
							</div>
						</div>

					</div>
				</div>
				<div class="row">
					<div class="col-lg-12">

						<ol class="breadcrumb">
							<li class="active"><i class="fa fa fa-bar-chart-o"></i>
								Stats</li>
						</ol>

					</div>
				</div>

				<!--         <div class="row hidden"> -->
				<!--           <div class="col-lg-12"> -->
				<!--             <div class="panel panel-primary"> -->
				<!--               <div class="panel-heading"> -->
				<!--                 <h3 class="panel-title"> -->
				<!-- 									<i class="fa fa-bar-chart-o"></i> Traffic Statistics: October 1, 2013 - October 31, 2013</h3> -->
				<!--               </div> -->
				<!--               <div class="panel-body"> -->
				<!--                 <div id="morris-chart-area"></div> -->
				<!--               </div> -->
				<!--             </div> -->
				<!--           </div> -->
				<!--         </div> -->
				<!-- /.row -->

				<div class="row">
					<div class="col-lg-4">
						<div class="panel panel-primary">
							<div class="panel-heading">
								<h3 class="panel-title">
									<i class="fa fa-long-arrow-right"></i> Reparto del
									entrenamiento
								</h3>
							</div>
							<div class="panel-body">
								<div id="morris-chart-donut"></div>
								<div class="text-right">
									<a href="#">View Details <i
										class="fa fa-arrow-circle-right"></i></a>
								</div>
							</div>
						</div>
					</div>
					<div class="col-lg-4">
						<div class="panel panel-primary">
							<div class="panel-heading">
								<h3 class="panel-title">
									<i class="fa fa-clock-o"></i> Athlete BIO
								</h3>
							</div>
							<div class="panel-body">
								<div class="box">
									<div class="box-header">
										<span class="title">Here be your stats</span>
										<ul class="box-toolbar">
											<li><span class="label label-blue">189</span></li>
										</ul>
									</div>
									<div class="box-content">
										<table class="table table-normal">
											<thead>
												<tr>
													<td></td>
													<td>Item</td>
													<td>Stats</td>
												</tr>
											</thead>

											<tbody>
												<tr>
													<td style="width: 60px;"><span class="dynamicbar">Loading..</span></td>
													<td style="text-align: center;"><i class="fa fa-child"></i>
														Peso</td>
													<td class="status-error"><i
														class="icon-circle-arrow-down"></i> -5%</td>
												</tr>

												<tr>
													<td style="width: 60px;"><span class="dynamicbar">1,4,4,7,5,9,10</span></td>
													<td style="text-align: center;"><i class="icon-heart"></i>
														FCR</td>
													<td class="status-success"><i
														class="icon-circle-arrow-up"></i> +10%</td>
												</tr>

												<tr>
													<td style="width: 60px;"><span class="dynamicbar">1,4,4,7,5,9,10</span></td>
													<td style="text-align: center;"><i class="icon-bell"></i>
														FCM</td>
													<td class="status-error"><i
														class="icon-circle-arrow-down"></i> -15%</td>
												</tr>

												<tr>
													<td style="width: 60px;"><span class="dynamicbar">1,4,4,7,5,9,10</span></td>
													<td style="text-align: center;"><i class="icon-trophy"></i>
														Run 10k</td>
													<td class="status-success"><i
														class="icon-circle-arrow-up"></i> +20%</td>
												</tr>

												<tr>
													<td style="width: 60px;"><span class="dynamicbar">1,4,4,7,5,9,10</span></td>
													<td style="text-align: center;"><i class="icon-trophy"></i>
														Swim 1k</td>
													<td class="status-success"><i
														class="icon-circle-arrow-up"></i> +20%</td>
												</tr>

												<tr>
													<td style="width: 60px;"><span class="dynamicbar">1,4,4,7,5,9,10</span></td>
													<td style="text-align: center;"><i class="icon-trophy"></i>
														Cycle 20k</td>
													<td class="status-success"><i
														class="icon-circle-arrow-up"></i> +20%</td>
												</tr>
											</tbody>
										</table>


									</div>
								</div>

							</div>
						</div>
					</div>
					<div class="col-lg-4">
						<div class="panel panel-primary">
							<div class="panel-heading">
								<h3 class="panel-title">
									<i class="fa fa-money"></i> Recent Transactions
								</h3>
							</div>
							<div class="panel-body">
								<div class="table-responsive">
									<table
										class="table table-bordered table-hover table-striped tablesorter">
										<thead>
											<tr>
												<th>Order # <i class="fa fa-sort"></i></th>
												<th>Order Date <i class="fa fa-sort"></i></th>
												<th>Order Time <i class="fa fa-sort"></i></th>
												<th>Amount (USD) <i class="fa fa-sort"></i></th>
											</tr>
										</thead>
										<tbody>
											<tr>
												<td>3326</td>
												<td>10/21/2013</td>
												<td>3:29 PM</td>
												<td>$321.33</td>
											</tr>
											<tr>
												<td>3325</td>
												<td>10/21/2013</td>
												<td>3:20 PM</td>
												<td>$234.34</td>
											</tr>
											<tr>
												<td>3324</td>
												<td>10/21/2013</td>
												<td>3:03 PM</td>
												<td>$724.17</td>
											</tr>
											<tr>
												<td>3323</td>
												<td>10/21/2013</td>
												<td>3:00 PM</td>
												<td>$23.71</td>
											</tr>
											<tr>
												<td>3322</td>
												<td>10/21/2013</td>
												<td>2:49 PM</td>
												<td>$8345.23</td>
											</tr>
											<tr>
												<td>3321</td>
												<td>10/21/2013</td>
												<td>2:23 PM</td>
												<td>$245.12</td>
											</tr>
											<tr>
												<td>3320</td>
												<td>10/21/2013</td>
												<td>2:15 PM</td>
												<td>$5663.54</td>
											</tr>
											<tr>
												<td>3319</td>
												<td>10/21/2013</td>
												<td>2:13 PM</td>
												<td>$943.45</td>
											</tr>
										</tbody>
									</table>
								</div>
								<div class="text-right">
									<a href="#">View All Transactions <i
										class="fa fa-arrow-circle-right"></i></a>
								</div>
							</div>
						</div>
					</div>
				</div>
				<!-- /.row -->

			</div>
			<!-- /#page-wrapper -->
			<s:set var="varDet" value="prueba" />

		</div>
		<!-- /#wrapper -->

		<!-- JavaScript -->

		<script src="../js/bootstrap.js"></script>

		<!-- Page Specific Plugins -->
		<script src="../js/raphael-min.js"></script>
		<script src="http://cdn.oesmith.co.uk/morris-0.4.3.min.js"></script>

		<script>
			var run = parseInt(<s:property value="porcentageR"/>);
			var swim = parseInt(<s:property value="porcentageS"/>);
			var cycle = parseInt(<s:property value="porcentageC"/>);

			var prueba2 = [ {
				label : 'Running',
				value : cycle
			}, {
				label : 'Cycling',
				value : run
			}, {
				label : 'Swiming',
				value : swim
			} ];
			//var prueba2=varDet;
			Morris.Donut({
				element : 'morris-chart-donut',
				data : prueba2

			});
		</script>
</body>
</html>
