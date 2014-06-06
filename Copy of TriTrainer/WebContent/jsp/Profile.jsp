<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta name="description" content="">
<meta name="author" content="">


<title>Signin Template for Bootstrap</title>

<!-- Bootstrap core CSS -->
<link href="../css/bootstrap.min.css" rel="stylesheet">


<!-- Custom styles for this template -->
<link href="../css/signin.css" rel="stylesheet">
<link href="../css/docs.min.css" rel="stylesheet">
<link href="../css/formulario.css" rel="stylesheet">

<!-- Just for debugging purposes. Don't actually copy this line! -->
<!--[if lt IE 9]><script src="../../assets/js/ie8-responsive-file-warning.js"></script><![endif]-->

<!-- HTML5 shim and Respond.js IE8 support of HTML5 elements and media queries -->
<!--[if lt IE 9]>
      <script src="https://oss.maxcdn.com/libs/html5shiv/3.7.0/html5shiv.js"></script>
      <script src="https://oss.maxcdn.com/libs/respond.js/1.4.2/respond.min.js"></script>
    <![endif]-->
<style type="text/css">
.errorStruts{font-weight: bold; color: red; padding: 2px 8px; margin-top: 2px;}
</style>

</head>

<body>

	<div class="container">
		<s:actionerror />
		<div class="row">
			<div
				class="col-xs-12 col-sm-8 col-md-6 col-sm-offset-2 col-md-offset-3">
				<s:form action="registro.action" method="post" theme="simple"
					id="contact-form">
					<h2>
						Please Sign Up <small>It's free and always will be.</small>
					</h2>
					<hr class="colorgraph">
					<div class="row">
						<div class="col-xs-6 col-sm-6 col-md-6">
							<div class="form-group">

								<s:textfield name="first_name" key="label.first_name"
									required="true" cssClass="form-control input-lg"
									placeholder="First Name" label="" tabindex="1" />

							</div>
						</div>
						<div class="col-xs-6 col-sm-6 col-md-6">
							<div class="form-group">
								<s:textfield name="last_name" key="label.last_name"
									required="true" cssClass="form-control input-lg"
									placeholder="Last Name" tabindex="2" />
							</div>
						</div>
					</div>
					<div class="form-group">
						<s:textfield name="display_name" key="label.display_name"
							required="true" cssClass="form-control input-lg"
							placeholder="Display Name" tabindex="3" />
							<div  style="font-weight: bold; color: red; padding: 2px 8px; margin-top: 2px;"><s:fielderror fieldName="display_name" /></div>
						
					</div>
					<div class="form-group">
						<s:textfield id="email" name="email" key="label.email"
							cssClass="form-control input-lg"
							placeholder="Email Address" tabindex="4" />
						<div class= "errorEmail" style="font-weight: bold; color: red; padding: 2px 8px; margin-top: 2px;"><s:fielderror fieldName="email" /> </div>
					</div>
					<div class="row">
						<div class="col-xs-6 col-sm-6 col-md-6">
							<div class="form-group">
								<s:password name="password" key="label.password" required="true"
									cssClass="form-control input-lg" placeholder="Password"
									tabindex="5" id="password" />
							</div>
						</div>
						<div class="col-xs-6 col-sm-6 col-md-6">
							<div class="form-group">
								<s:password name="password_confirmation" required="true"
									key="label.password_confirmation"
									cssClass="form-control input-lg" placeholder="Confirm Password"
									id="password_confirmation" tabindex="6" />
							</div>
						</div>
					</div>
					<div class="row">
						<div class="col-xs-3 col-sm-3 col-md-3">
							<span class="button-checkbox"> <input type="checkbox"
								name="tandc">
							</span>
						</div>
						<div class="col-xs-9 col-sm-9 col-md-9">
							By clicking <strong class="label label-primary">Register</strong>,
							you agree to the <a href="#" data-toggle="modal"
								data-target="#t_and_c_m">Terms and Conditions</a> set out by
							this site, including our Cookie Use.
						</div>
					</div>

					<hr class="colorgraph">
					<div class="row">
						<div class="col-xs-6 col-md-6">
							<s:submit method="execute" key="label.Register"
								cssClass="btn btn-primary btn-block btn-lg" value="Register" />
						</div>
						<div class="col-xs-6 col-md-6">
							<a href="jsp/Login.jsp" class="btn btn-success btn-block btn-lg">Sign
								In</a>
						</div>
					</div>
				</s:form>
			</div>
		</div>
		<!-- Modal -->
		<div class="modal fade" id="t_and_c_m" tabindex="-1">
			<div class="modal-dialog">
				<div class="modal-content">
					<div class="modal-header">
						<button type="button" class="close" data-dismiss="modal">×</button>
						<h4 class="modal-title" id="myModalLabel">Terms &amp;
							Conditions</h4>
					</div>
					<div class="modal-body">
						<p>Legal Notices We, the Operators of this Website, provide it
							as a public service to our users. Please carefully review the
							following basic rules that govern your use of the Website. Please
							note that your use of the Website constitutes your unconditional
							agreement to follow and be bound by these Terms and Conditions of
							Use. If you (the "User") do not agree to them, do not use the
							Website, provide any materials to the Website or download any
							materials from them. The Operators reserve the right to update or
							modify these Terms and Conditions at any time without prior
							notice to User. Your use of the Website following any such change
							constitutes your unconditional agreement to follow and be bound
							by these Terms and Conditions as changed. For this reason, we
							encourage you to review these Terms and Conditions of Use
							whenever you use the Website. These Terms and Conditions of Use
							apply to the use of the Website and do not extend to any linked
							third party sites. These Terms and Conditions and our Privacy
							Policy, which are hereby incorporated by reference, contain the
							entire agreement (the ""Agreement"") between you and the
							Operators with respect to the Website. Any rights not expressly
							granted herein are reserved.</p>
						<p>Permitted and Prohibited Uses You may use the the Website
							for the sole purpose of sharing and exchanging ideas with other
							Users. You may not use the the Website to violate any applicable
							local, state, national, or international law, including without
							limitation any applicable laws relating to antitrust or other
							illegal trade or business practices, federal and state securities
							laws, regulations promulgated by the U.S. Securities and Exchange
							Commission, any rules of any national or other securities
							exchange, and any U.S. laws, rules, and regulations governing the
							export and re-export of commodities or technical data. You may
							not upload or transmit any material that infringes or
							misappropriates any person's copyright, patent, trademark, or
							trade secret, or disclose via the the Website any information the
							disclosure of which would constitute a violation of any
							confidentiality obligations you may have. You may not upload any
							viruses, worms, Trojan horses, or other forms of harmful computer
							code, nor subject the Website's network or servers to
							unreasonable traffic loads, or otherwise engage in conduct deemed
							disruptive to the ordinary operation of the Website. You are
							strictly prohibited from communicating on or through the Website
							any unlawful, harmful, offensive, threatening, abusive, libelous,
							harassing, defamatory, vulgar, obscene, profane, hateful,
							fraudulent, sexually explicit, racially, ethnically, or otherwise
							objectionable material of any sort, including, but not limited
							to, any material that encourages conduct that would constitute a
							criminal offense, give rise to civil liability, or otherwise
							violate any applicable local, state, national, or international
							law. You are expressly prohibited from compiling and using other
							Users' personal information, including addresses, telephone
							numbers, fax numbers, email addresses or other contact
							information that may appear on the Website, for the purpose of
							creating or compiling marketing and/or mailing lists and from
							sending other Users unsolicited marketing materials, whether by
							facsimile, email, or other technological means. You also are
							expressly prohibited from distributing Users' personal
							information to third-party parties for marketing purposes. The
							Operators shall deem the compiling of marketing and mailing lists
							using Users' personal information, the sending of unsolicited
							marketing materials to Users, or the distribution of Users'
							personal information to third parties for marketing purposes as a
							material breach of these Terms and Conditions of Use, and the
							Operators reserve the right to terminate or suspend your access
							to and use of the Website and to suspend or revoke your
							membership in the consortium without refund of any membership
							dues paid. The Operators note that unauthorized use of Users'
							personal information in connection with unsolicited marketing
							correspondence also may constitute violations of various state
							and federal anti-spam statutes. The Operators reserve the right
							to report the abuse of Users' personal information to the
							appropriate law enforcement and government authorities, and the
							Operators will fully cooperate with any authorities investigating
							violations of these laws.</p>
						<p>User Submissions The Operators do not want to receive
							confidential or proprietary information from you through the
							Website. Any material, information, or other communication you
							transmit or post ("Contributions") to the Website will be
							considered non-confidential. All contributions to this site are
							licensed by you under the MIT License to anyone who wishes to use
							them, including the Operators. If you work for a company or at a
							University, it's likely that you're not the copyright holder of
							anything you make, even in your free time. Before making
							contributions to this site, get written permission from your
							employer.</p>
						<p>User Discussion Lists and Forums The Operators may, but are
							not obligated to, monitor or review any areas on the Website
							where users transmit or post communications or communicate solely
							with each other, including but not limited to user forums and
							email lists, and the content of any such communications. The
							Operators, however, will have no liability related to the content
							of any such communications, whether or not arising under the laws
							of copyright, libel, privacy, obscenity, or otherwise. The
							Operators may edit or remove content on the the Website at their
							discretion at any time.</p>
						<p>Use of Personally Identifiable Information Information
							submitted to the Website is governed according to the Operators's
							current Privacy Policy and the stated license of this website.

							You agree to provide true, accurate, current, and complete
							information when registering with the Website. It is your
							responsibility to maintain and promptly update this account
							information to keep it true, accurate, current, and complete. If
							you provides any information that is fraudulent, untrue,
							inaccurate, incomplete, or not current, or we have reasonable
							grounds to suspect that such information is fraudulent, untrue,
							inaccurate, incomplete, or not current, we reserve the right to
							suspend or terminate your account without notice and to refuse
							any and all current and future use of the Website. Although
							sections of the Website may be viewed simply by visiting the
							Website, in order to access some Content and/or additional
							features offered at the Website, you may need to sign on as a
							guest or register as a member. If you create an account on the
							Website, you may be asked to supply your name, address, a User ID
							and password. You are responsible for maintaining the
							confidentiality of the password and account and are fully
							responsible for all activities that occur in connection with your
							password or account. You agree to immediately notify us of any
							unauthorized use of either your password or account or any other
							breach of security. You further agree that you will not permit
							others, including those whose accounts have been terminated, to
							access the Website using your account or User ID. You grant the
							Operators and all other persons or entities involved in the
							operation of the Website the right to transmit, monitor,
							retrieve, store, and use your information in connection with the
							operation of the Website and in the provision of services to you.
							The Operators cannot and do not assume any responsibility or
							liability for any information you submit, or your or third
							parties' use or misuse of information transmitted or received
							using website. To learn more about how we protect the privacy of
							the personal information in your account, please visit our
							Privacy Policy.</p>
						<p>WARRANTY DISCLAIMER THE WEBSITE AND ASSOCIATED MATERIALS
							ARE PROVIDED ON AN "AS IS" AND "AS AVAILABLE" BASIS. TO THE FULL
							EXTENT PERMISSIBLE BY APPLICABLE LAW, THE OPERATORS DISCLAIM ALL
							WARRANTIES, EXPRESS OR IMPLIED, INCLUDING, BUT NOT LIMITED TO,
							IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A
							PARTICULAR PURPOSE, OR NON-INFRINGEMENTOF INTELLECTUAL PROPERTY.
							THE OPERATORS MAKE NO REPRESENTATIONS OR WARRANTY THAT THE
							WEBSITE WILL MEET YOUR REQUIREMENTS, OR THAT YOUR USE OF THE
							WEBSITE WILL BE UNINTERRUPTED, TIMELY, SECURE, OR ERROR FREE; NOR
							DO THE OPERATORS MAKE ANY REPRESENTATION OR WARRANTY AS TO THE
							RESULTS THAT MAY BE OBTAINED FROM THE USE OF THE WEBSITE. THE
							OPERATORS MAKE NO REPRESENTATIONS OR WARRANTIES OF ANY KIND,
							EXPRESS OR IMPLIED, AS TO THE OPERATION OF THE WEBSITE OR THE
							INFORMATION, CONTENT, MATERIALS, OR PRODUCTS INCLUDED ON THE
							WEBSITE. IN NO EVENT SHALL THE OPERATORS OR ANY OF THEIR AGENTS,
							VENDORS OR SUPPLIERS BE LIABLE FOR ANY DAMAGES WHATSOEVER
							(INCLUDING, WITHOUT LIMITATION, DAMAGES FOR LOSS OF PROFITS,
							BUSINESS INTERRUPTION, LOSS OF INFORMATION) ARISING OUT OF THE
							USE, MISUSE OF OR INABILITY TO USE THE WEBSITE, EVEN IF THE
							OPERATORS HAVE BEEN ADVISED OF THE POSSIBILITY OF SUCH DAMAGES.
							THIS DISCLAIMER CONSTITUTES AN ESSENTIAL PART OF THIS AGREEMENT.
							BECAUSE SOME JURISDICTIONS PROHIBIT THE EXCLUSION OR LIMITATION
							OF LIABILITY FOR CONSEQUENTIAL OR INCIDENTAL DAMAGES, THE ABOVE
							LIMITATION MAY NOT APPLY TO YOU. YOU UNDERSTAND AND AGREE THAT
							ANY CONTENT DOWNLOADED OR OTHERWISE OBTAINED THROUGH THE USE OF
							THE WEBSITE IS AT YOUR OWN DISCRETION AND RISK AND THAT YOU WILL
							BE SOLELY RESPONSIBLE FOR ANY DAMAGE TO YOUR COMPUTER SYSTEM OR
							LOSS OF DATA OR BUSINESS INTERRUPTION THAT RESULTS FROM THE
							DOWNLOAD OF CONTENT. THE OPERATORS SHALL NOT BE RESPONSIBLE FOR
							ANY LOSS OR DAMAGE CAUSED, OR ALLEGED TO HAVE BEEN CAUSED,
							DIRECTLY OR INDIRECTLY, BY THE INFORMATION OR IDEAS CONTAINED,
							SUGGESTED OR REFERENCED IN OR APPEARING ON THE WEBSITE. YOUR
							PARTICIPATION IN THE WEBSITE IS SOLELY AT YOUR OWN RISK. NO
							ADVICE OR INFORMATION, WHETHER ORAL OR WRITTEN, OBTAINED BY YOU
							FROM THE OPERATORS OR THROUGH THE OPERATORS, THEIR EMPLOYEES, OR
							THIRD PARTIES SHALL CREATE ANY WARRANTY NOT EXPRESSLY MADE
							HEREIN. YOU ACKNOWLEDGE, BY YOUR USE OF THE THE WEBSITE, THAT
							YOUR USE OF THE WEBSITE IS AT YOUR SOLE RISK. LIABILITY
							LIMITATION. UNDER NO CIRCUMSTANCES AND UNDER NO LEGAL OR
							EQUITABLE THEORY, WHETHER IN TORT, CONTRACT, NEGLIGENCE, STRICT
							LIABILITY OR OTHERWISE, SHALL THE OPERATORS OR ANY OF THEIR
							AGENTS, VENDORS OR SUPPLIERS BE LIABLE TO USER OR TO ANY OTHER
							PERSON FOR ANY INDIRECT, SPECIAL, INCIDENTAL OR CONSEQUENTIAL
							LOSSES OR DAMAGES OF ANY NATURE ARISING OUT OF OR IN CONNECTION
							WITH THE USE OF OR INABILITY TO USE THE THE WEBSITE OR FOR ANY
							BREACH OF SECURITY ASSOCIATED WITH THE TRANSMISSION OF SENSITIVE
							INFORMATION THROUGH THE WEBSITE OR FOR ANY INFORMATION OBTAINED
							THROUGH THE WEBSITE, INCLUDING, WITHOUT LIMITATION, DAMAGES FOR
							LOST PROFITS, LOSS OF GOODWILL, LOSS OR CORRUPTION OF DATA, WORK
							STOPPAGE, ACCURACY OF RESULTS, OR COMPUTER FAILURE OR
							MALFUNCTION, EVEN IF AN AUTHORIZED REPRESENTATIVE OF THE
							OPERATORS HAS BEEN ADVISED OF OR SHOULD HAVE KNOWN OF THE
							POSSIBILITY OF SUCH DAMAGES. THE OPERATORS'S TOTAL CUMULATIVE
							LIABILITY FOR ANY AND ALL CLAIMS IN CONNECTION WITH THE WEBSITE
							WILL NOT EXCEED FIVE U.S. DOLLARS ($5.00). USER AGREES AND
							ACKNOWLEDGES THAT THE FOREGOING LIMITATIONS ON LIABILITY ARE AN
							ESSENTIAL BASIS OF THE BARGAIN AND THAT THE OPERATORS WOULD NOT
							PROVIDE THE WEBSITE ABSENT SUCH LIMITATION.</p>
						<p>General The Website is hosted in the United States. The
							Operators make no claims that the Content on the Website is
							appropriate or may be downloaded outside of the United States.
							Access to the Content may not be legal by certain persons or in
							certain countries. If you access the Website from outside the
							United States, you do so at your own risk and are responsible for
							compliance with the laws of your jurisdiction. The provisions of
							the UN Convention on Contracts for the International Sale of
							Goods will not apply to these Terms. A party may give notice to
							the other party only in writing at that party's principal place
							of business, attention of that party's principal legal officer,
							or at such other address or by such other method as the party
							shall specify in writing. Notice shall be deemed given upon
							personal delivery or facsimile, or, if sent by certified mail
							with postage prepaid, 5 business days after the date of mailing,
							or, if sent by international overnight courier with postage
							prepaid, 7 business days after the date of mailing. If any
							provision herein is held to be unenforceable, the remaining
							provisions will continue in full force without being affected in
							any way. Further, the parties agree to replace such unenforceable
							provision with an enforceable provision that most closely
							approximates the intent and economic effect of the unenforceable
							provision. Section headings are for reference purposes only and
							do not define, limit, construe or describe the scope or extent of
							such section. The failure of the Operators to act with respect to
							a breach of this Agreement by you or others does not constitute a
							waiver and shall not limit the Operators' rights with respect to
							such breach or any subsequent breaches. Any action or proceeding
							arising out of or related to this Agreement or User's use of the
							Website must be brought in the courts of Belgium, and you consent
							to the exclusive personal jurisdiction and venue of such courts.
							Any cause of action you may have with respect to your use of the
							Website must be commenced within one (1) year after the claim or
							cause of action arises. These Terms set forth the entire
							understanding and agreement of the parties, and supersedes any
							and all oral or written agreements or understandings between the
							parties, as to their subject matter. The waiver of a breach of
							any provision of this Agreement shall not be construed as a
							waiver of any other or subsequent breach.</p>
					</div>
					<div class="modal-footer">
						<button type="button" class="btn btn-primary" data-dismiss="modal">I
							Agree</button>
					</div>
				</div>
				<!-- /.modal-content -->
			</div>
			<!-- /.modal-dialog -->
		</div>
		<!-- /.modal -->
	</div>
	<script
		src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.0/jquery.min.js"></script>
	<script src="../js/bootstrap.min.js"></script>
	<script src="../js/docs.min.js"></script>
	<script src="../js/bootstrap.js" type="text/javascript"></script>
	<script src="../js/jquery.validate.js"></script>
	<script src="../js/script.js"></script>



</body>
</html>

