
<!DOCTYPE html>
<html lang="en">
  <head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <meta name="description" content="">
    <meta name="author" content="">


    <title>TriTrainer</title>

    <!-- Bootstrap core CSS -->
    <link href="css/bootstrap.min.css" rel="stylesheet">
    <link href="css/docs.min.css" rel="stylesheet">
    <link href="css/fonts.css" rel="stylesheet">

    <!-- Just for debugging purposes. Don't actually copy this line! -->
    <!--[if lt IE 9]><script src="../../assets/js/ie8-responsive-file-warning.js"></script><![endif]-->

    <!-- HTML5 shim and Respond.js IE8 support of HTML5 elements and media queries -->
    <!--[if lt IE 9]>
      <script src="https://oss.maxcdn.com/libs/html5shiv/3.7.0/html5shiv.js"></script>
      <script src="https://oss.maxcdn.com/libs/respond.js/1.4.2/respond.min.js"></script>
    <![endif]-->

    <!-- Custom styles for this template -->
    <link href="css/carousel.css" rel="stylesheet">
      <style >
      .input-group[class*="col-"] {
    	padding-right: 15px;
    	padding-left: 15px;
		}
</style>
  </head>

<!-- NAVBAR
================================================== -->
  <body>
    <div class="navbar-wrapper">
      <div class="container">

        <div class="navbar navbar-inverse navbar-static-top">
          <div class="container">
            <div class="navbar-header">
              <button type="button" class="navbar-toggle" data-toggle="collapse" data-target=".navbar-collapse">
                <span class="sr-only">Toggle navigation</span>
                <span class="icon-bar"></span>
                <span class="icon-bar"></span>
                <span class="icon-bar"></span>
              </button>
              
              <a class="navbar-brand" href="#"><img src="images/iconoLogo.png"> TriTrainer</a>
            </div>
             
            <div class="navbar-collapse collapse">
              <ul class="nav navbar-nav" style="padding-left: 10%; padding-top: 2%;">
                <li class="active"><a href="#">Home</a></li>
               
                <li><a href="#" class="" data-toggle="modal" data-target="#AboutModal">About</a></li>
                <li><a href="#" class="" data-toggle="modal" data-target="#ContactModal">Contact</a></li>
				 
              </ul>
              <a href="jsp/Login.jsp"><button type="button" class="btn btn-success right" style="margin : 35px">Sign in</button> </a>
            </div>
           
          </div>
        </div>

      </div>
    </div>
    
	<!--  VENTANA MODAL ABOUT -->
	<div class="modal fade" id="AboutModal" tabindex="-1">
		<div class="modal-dialog">
			<div class="modal-content">
				<div class="modal-header">
					<button type="button" class="close" data-dismiss="modal">&times;</button>
					<h4 class="modal-title" id="myModalLabel">About Us</h4>
				</div>
				<div class="modal-body">
					<h2 id="team-core">Core team</h2>
					<div class="list-group bs-team">

						<div class="list-group-item">
							<iframe class="github-btn"
								src="http://ghbtns.com/github-btn.html?user=cmartinmor&amp;type=follow"></iframe>
							<a class="team-member" href="https://github.com/cmartinmor">
								<img
								src="http://www.gravatar.com/avatar/233588d5d7f5dbb85fa061c926ecc6cf.png"
								alt="@cmartinmor"> <strong>Carlos Martín</strong> 
							</a>
							
      						<a href="https://twitter.com/cardundo" class="twitter-follow-button" data-link-color="#0069D6" data-show-count="true">@cardundo</a>
    						
						</div>
					</div>
				</div>
				</div>
			</div>
		</div>
		<!--FIN VENTANA MODAL ABOUT -->
		
		<!--  VENTANA MODAL CONTACT -->
		
		<div id="ContactModal" class="modal fade" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
        <div class="modal-dialog">
        <div class="modal-content">
        <div class="modal-header">
            <button type="button" class="close" data-dismiss="modal" aria-hidden="true">&times;</button>
            <h4 class="modal-title">Tell us what you think...</h4>
        </div>
        <div class="modal-body">
            <form class="form-horizontal" name="commentform" method="post" action="email.php">
                <div class="form-group">
                    <label class="control-label col-md-4" for="first_name">First Name</label>
                    <div class="col-md-6">
                    	<input type="text" class="form-control" id="first_name" name="first_name" placeholder="First Name"/>
                    </div>
                </div>
                <div class="form-group">
                    <label class="control-label col-md-4" for="last_name">Last Name</label>
                    <div class="col-md-6">
                        <input type="text" class="form-control" id="last_name" name="last_name" placeholder="Last Name"/>
                    </div>
                </div>
                <div class="form-group">
                    <label class="control-label col-md-4" for="email">Email Address</label>
                    <div class="col-md-6 input-group">
                    <span class="input-group-addon">@</span>
						<input type="email" class="form-control" id="email" name="email" placeholder="Email Address"/>
                    </div>
                </div>
                <div class="form-group">
                    <label class="control-label col-md-4" for="comment">Question or Comment</label>
                    <div class="col-md-6">
                        <textarea rows="6" class="form-control" id="comments" name="comments" placeholder="Your question or comment here"></textarea>
                    </div>
                </div>
                <div class="form-group">
                    <div class="col-md-4"></div>
                    <div class="col-md-2">
                        <button type="submit" value="Submit" class="btn btn-success btn-lg btn-custom" id="send_btn">Send</button>
                    </div>

                </div>
            </form>
        </div><!-- End of Modal body -->
        </div><!-- End of Modal content -->
        </div><!-- End of Modal dialog -->
    </div><!-- End of Modal -->
		
		<!--FIN VENTANA MODAL CONTACT -->
		
		<!-- Carousel
    ================================================== -->
		<div id="myCarousel" class="carousel slide" data-ride="carousel">
			<!-- Indicators -->


			<ol class="carousel-indicators">
				<li data-target="#myCarousel" data-slide-to="0" class="active"></li>
				<li data-target="#myCarousel" data-slide-to="1"></li>
				<li data-target="#myCarousel" data-slide-to="2"></li>
			</ol>
			<div class="carousel-inner">
				<div class="item active">
					<img
						src="images/swim.jpg"
						alt="Swim">
					<div class="container">
						<div class="carousel-caption">
							<h1>Because sometimes one sport is not enough, then you need three.</h1>
							<p></p>
							<p>
								<a class="btn btn-lg btn-primary" href="jsp/Registro.jsp" role="button">Sign
									up today</a>
							</p>
						</div>
					</div>
				</div>
				<div class="item">
					<img
						src="images/IMG_0021.JPG"
						alt="Ride">
					<div class="container">
						<div class="carousel-caption">
							<h1>If you set a goal for yourself and are able to achieve it, you have won your race. Your goal can be to come in first, to improve your performance, or just finish the race its up to you.</h1>
						
								<a class="btn btn-lg btn-primary" href="#" role="button">Learn
									more</a>
							</p>
						</div>
					</div>
				</div>
				<div class="item">
					<img
						src="images/P7071182-2.jpg"
						alt="and Run like hell!">
					<div class="container">
						<div class="carousel-caption">
							<h1>You can quit if you want, and no one will care. But you will know the rest of your life.</h1>

								<a class="btn btn-lg btn-primary" href="#" role="button">Browse
									gallery</a>
							</p>
						</div>
					</div>
				</div>
			</div>
			<a class="left carousel-control" href="#myCarousel" data-slide="prev"><span
				class="glyphicon glyphicon-chevron-left"></span></a> <a
				class="right carousel-control" href="#myCarousel" data-slide="next"><span
				class="glyphicon glyphicon-chevron-right"></span></a>
		</div>
		<!-- /.carousel -->



		<!-- Marketing messaging and featurettes
    ================================================== -->
		<!-- Wrap the rest of the page in another container to center all the content. -->

		<div class="container marketing">

			<!-- Three columns of text below the carousel -->
			<div class="row">
				<div class="col-lg-4">
					<img class="img-circle" src="images/RUN140X140.jpg"
						alt="Running">
					<h2>Running</h2>
					<p>Actually, I think I run for happiness. I think that life has to be cheerful, and that is what I am looking for. For me, happiness is to get in touch with nature, with the mountain, making sport. So I run for that.</p>
					<h6>Kilian Jornet.</h6>
					<p>
						<a class="btn btn-default" href="#" role="button">View details
							&raquo;</a>
					</p>
				</div>
				<!-- /.col-lg-4 -->
				<div class="col-lg-4">
					<img class="img-circle" src="images/BICI140X140.jpg"
						alt="Cycling">
					<h2>Cycling</h2>
					<p>In sport you always think the strongest guy should be going for it and getting the best results. The thing is, cycling also has a very important team aspect, which I don't think that a lot of people fully grasp.</p>
					<h6>Chris Froome.</h6>
					<p>
						<a class="btn btn-default" href="#" role="button">View details
							&raquo;</a>
					</p>
				</div>
				<!-- /.col-lg-4 -->
				<div class="col-lg-4">
					<img class="img-circle" src="images/swin140x140.jpg"
						alt="Swiming">
					<h2>Swiming</h2>
					<p>I feel most at home in the water. I disappear. That's where I belong. Swimming is normal for me. I'm relaxed. I'm comfortable, and I know my surroundings. It's my home.</p>
					<h6>Michael Phelps.</h6>
					<p>
						<a class="btn btn-default" href="#" role="button">View details
							&raquo;</a>
					</p>
				</div>
				<!-- /.col-lg-4 -->
			</div>
			<!-- /.row -->


			<!-- START THE FEATURETTES -->

			<hr class="featurette-divider">

			<div class="row featurette">
				<div class="col-md-7">
					<h2 class="featurette-heading">
						First featurette heading. <span class="text-muted">It'll
							blow your mind.</span>
					</h2>
					<p class="lead">Donec ullamcorper nulla non metus auctor
						fringilla. Vestibulum id ligula porta felis euismod semper.
						Praesent commodo cursus magna, vel scelerisque nisl consectetur.
						Fusce dapibus, tellus ac cursus commodo.</p>
				</div>
				<div class="col-md-5">
					<img class="featurette-image img-responsive"
						data-src="holder.js/500x500/auto" alt="Generic placeholder image">
				</div>
			</div>

			<hr class="featurette-divider">

			<div class="row featurette">
				<div class="col-md-5">
					<img class="featurette-image img-responsive"
						data-src="holder.js/500x500/auto" alt="Generic placeholder image">
				</div>
				<div class="col-md-7">
					<h2 class="featurette-heading">
						Oh yeah, it's that good. <span class="text-muted">See for
							yourself.</span>
					</h2>
					<p class="lead">Donec ullamcorper nulla non metus auctor
						fringilla. Vestibulum id ligula porta felis euismod semper.
						Praesent commodo cursus magna, vel scelerisque nisl consectetur.
						Fusce dapibus, tellus ac cursus commodo.</p>
				</div>
			</div>

			<hr class="featurette-divider">

			<div class="row featurette">
				<div class="col-md-7">
					<h2 class="featurette-heading">
						And lastly, this one. <span class="text-muted">Checkmate.</span>
					</h2>
					<p class="lead">Donec ullamcorper nulla non metus auctor
						fringilla. Vestibulum id ligula porta felis euismod semper.
						Praesent commodo cursus magna, vel scelerisque nisl consectetur.
						Fusce dapibus, tellus ac cursus commodo.</p>
				</div>
				<div class="col-md-5">
					<img class="featurette-image img-responsive"
						data-src="holder.js/500x500/auto" alt="Generic placeholder image">
				</div>
			</div>

			<hr class="featurette-divider">

			<!-- /END THE FEATURETTES -->


			<!-- FOOTER -->
			<footer>
				<p class="pull-right">
					<a href="#">Back to top</a>
				</p>
				<p>
					&copy; 2014 Company, Inc. &middot; <a href="#">Privacy</a> &middot;
					<a href="#">Terms</a>
				</p>
			</footer>

		</div>
		<!-- /.container -->


		<!-- Bootstrap core JavaScript
    ================================================== -->
		<!-- Placed at the end of the document so the pages load faster -->
		<script
			src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.0/jquery.min.js"></script>
			<script src="http://cdnjs.cloudflare.com/ajax/libs/jquery/2.0.3/jquery.min.js"></script>
		<script src="js/bootstrap.min.js"></script>
		<script src="js/docs.min.js"></script>
		<script src="js/jquery.js" type="text/javascript"></script>
		<script src="js/bootstrap.js" type="text/javascript"></script>
		<script>
$('#send_btn').popover({content: 'Thank You'},'click');	
</script>
</body>
</html>
