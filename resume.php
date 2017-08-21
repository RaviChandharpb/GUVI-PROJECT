<?php

include 'functions.php';

session_start();


if ( !is_logged_in() ) 
{
	
header('location: index.php');
	
die();
}


?>
<html>
<HEAD>
<STYLE>
#ONE
{
MARGIN-LEFT:800PX;
MARGIN-BOTTOM:-140PX;
}
h2{
color:red;
}
p{
color:yellow;
}

h5{
color:yellow;
}

</STYLE>
</HEAD>
<body bgcolor="SKY BLUE\">
<h1><U><p><b><i><CENTER>.        Default        RESUME                         .</CENTER><b><i></P></U></h1>

<DIV ID="ONE">

<P align="CENTER"><img src="ra.jpg " alt="no image file available"width="200" height="150">
</P>
</DIV> 


<DIV ID="TWO">
<h2><u>CONTACT DETAILS</u></h2>
<ul>
<li>Email id = ravifabulous471@gmail.com</li>
<li>Phone number=9500776259</li>
<li>Address:savari muthu street mannady chennai 1</li>
</ul></P>
</DIV>




<P><a href='logout.php'>LOGOUT</a></P>
<CENTER><P>MY COLLEGE DETAILS:</P>

<a href="http://www.saec.ac.in">CLICK HERE</a>
</CENTER>
<P><U><h2> CAREER OBJECTIVE</h2></U> </P>
<P>
	To work in an organization where I can use my skills to achieve the organization’s
Objective and get conductive environment to learn and grow.
</P>
<P><h2><U> ACADEMIC PROFILE:</U></h2> </P>
<table border="5" style="width:100%" align ="center">
<center>
  <tr>
    <td align="center"><h5>COURSE</h5></td>
    <td align="center"><h5>INSTITUTION</h5></td>		
    <td align="center"> <h5>BOARD/UNIVERSITY</h5></td>
    <td align="center"><h5>PERCENTAGE</h5></td>
    <td align="center"><h5>YEAR OF PASSING</h5></td> 
  </tr>
  <tr>
    <td>B.E(CSE)</td>
    <td>S.A engineering college</td>		
    <td>Anna university</td>
    <td>7.46( upto I sem)</td>
    <td>2014 -2018</td>
  </tr>
  <tr>
    <td>Higher secondary</td>
    <td>St. Gabriel’s Higher Secondary School</td>		
    <td>State board</td>
    <td>84.6%</td>
    <td>2014</td>
  </tr>
  <tr>
    <td>High school</td>
    <td>St. Gabriel’s Higher Secondary School</td>		
    <td>State board</td>
    <td>94.2%</td>
    <td>2012</td>
  </tr>
</center>
</table>
<P><U><h2> TECHNICAL KNOWLEDGE:</U></h2> </P>
<ul>
<li>Operating systems: windows XP/7</li>
</ul>
<P><U><h2>PERSONAL ASSETS:</h2></U></P> 
<ul>
<li>Aspire to gain knowledge</li>
<li>Creating friendly atmosphere.</li>
<li>Strongly Analytic and leadership skills.</li>
</ul></P>
<P><U><h2>ACHIEVEMENTS AND EXTRA CURRICULAR ACTIVITES:</h2></U></P> 
<ul>
<li>PRESIDENT  OF  Personality Development Cell in school level.</li>
<li>ACTIVELY attended “CIVIL SERVICES AWARENESS CAMP “
Conducted by “DON BOSCO VAZHIKAATI”.
</li>
<li>“BEST ALL ROUNDER” of “ST.GABRIELS HR.SEC SCHOOL”  (2013 -2014). </li>
<li>Secured FIRST PLACE  in  SSLC PUBLIC EXAM  School level.</li>
<li>Active member in “J.R.C” and “ N.S.S”</li>
</ul></P>
<P><U><h2>PERSONAL PROFILE</h2></U></P> 
<ul>
<li>Name     			: Ravi chandhar .P.B</li>
<li>Father’s name		: Bala chandran .P.R</li>
<li>Mother’s name		: Sasi .T.S</li>
<li>D: O: B			: 19: 05: 1997</li>
<li>Nationality			: Indian</li>
<li>Languages Known   	: Tamil, English.</li>
<li>Hobbies			: playing chess.</li>
</ul></P>
<P><U> <h2>DECLARATION:</h2></U> </P>
<P>
	 I hereby declare that the particulars of information and facts stated here in above are true, 
 and complete to the best of my knowledge and belief.
</P>
<P><STRONG>PLACE: CHENNAI</STRONG></P>

</body>
</html>