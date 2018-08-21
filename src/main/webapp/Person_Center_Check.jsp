﻿<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="zh">

<head>
	<meta charset="UTF-8">
	<meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
	<meta name="viewport" content="width=device-width, initial-scale=1.0">
	<title>个人中心 查看</title>

	<link rel="stylesheet" type="text/css" href="css/normalize.css" />
	<link rel="stylesheet" type="text/css" href="css/demo.css">
	<link href="css/font-awesome.min.css" rel="stylesheet">
	<link rel="stylesheet" href="css/style1.css">
	<link href="css/buttons.css" rel="stylesheet">

</head>

<body>

	<nav>
		<a href="Person_Center_Check.jsp" id="userPLink">
			<span class="fa fa-user"></span>
			<span class="Person_Center_Username">名字</span>
			<span class="Person_Center_Cookie"></span>
		</a>
		<div id="sideMenu">
			<span class="fa fa-navicon" id="sideMenuClosed"></span>
		</div>
	</nav>


	<div id="sideMenuContainer">
		<h2>个人中心</h2>
		<a href="Person_Center_Check.jsp" title="查看发言 "><span class="fa fa-bolt"></span></a>
		<a href="Person_Center_publish.jsp" title="发布"><span class="fa fa-exclamation-circle"></span></a>
	</div>

	<!--中间-->

	<div class="main">
		<h2 class="main_title">
			个人中心
		</h2>
		<div class="main_article">
			<h3>心情好啊</h3>
			<div class="main_article_content">
				我一直很疑惑一件事情，你我到底是否有心灵感应，我一直觉得我们有，因为有时没有什么缘由的就会突然想到你，我爱你，我知道你很好，我真的爱你，可能这辈子作孽太多，没有福分和你在一起，因为我没结婚的时候就笃定的认为婚姻是命中注定的，后来也在网上看到只有福报相当的人才能结为夫妻，没能和你在一起大概福报不够吧，可我真的不甘心啊，有缘的夫妻不费劲就能走到一起，不管善缘还是恶缘，没缘的人想尽一切办法，用尽力气也换不来一世夫妻，知道想多了也没用，但是就是忍不住想你
			</div>
			<div class="main_article_button">
				<button class="button button-rounded button-tiny">
					删除
				</button >
				<button class="button button-rounded button-tiny">查看详情</button>
			</div>
		</div>
		<div class="main_article">
			<h3>心情好啊</h3>
			<div class="main_article_content">
				我一直很疑惑一件事情，你我到底是否有心灵感应，我一直觉得我们有，因为有时没有什么缘由的就会突然想到你，我爱你，我知道你很好，我真的爱你，可能这辈子作孽太多，没有福分和你在一起，因为我没结婚的时候就笃定的认为婚姻是命中注定的，后来也在网上看到只有福报相当的人才能结为夫妻，没能和你在一起大概福报不够吧，可我真的不甘心啊，有缘的夫妻不费劲就能走到一起，不管善缘还是恶缘，没缘的人想尽一切办法，用尽力气也换不来一世夫妻，知道想多了也没用，但是就是忍不住想你
			</div>
			<div class="main_article_button">
				<button class="button button-rounded button-tiny">
					删除
				</button >
				<button class="button button-rounded button-tiny">查看详情</button>
			</div>
		</div>
		<div class="main_article">
			<h3>心情好啊</h3>
			<div class="main_article_content">
				我一直很疑惑一件事情，你我到底是否有心灵感应，我一直觉得我们有，因为有时没有什么缘由的就会突然想到你，我爱你，我知道你很好，我真的爱你，可能这辈子作孽太多，没有福分和你在一起，因为我没结婚的时候就笃定的认为婚姻是命中注定的，后来也在网上看到只有福报相当的人才能结为夫妻，没能和你在一起大概福报不够吧，可我真的不甘心啊，有缘的夫妻不费劲就能走到一起，不管善缘还是恶缘，没缘的人想尽一切办法，用尽力气也换不来一世夫妻，知道想多了也没用，但是就是忍不住想你
			</div>
			<div class="main_article_button">
				<button class="button button-rounded button-tiny">
					删除
				</button >
				<button class="button button-rounded button-tiny">查看详情</button>
			</div>
		</div>
		<div class="main_article">
			<h3>心情好啊</h3>
			<div class="main_article_content">
				我一直很疑惑一件事情，你我到底是否有心灵感应，我一直觉得我们有，因为有时没有什么缘由的就会突然想到你，我爱你，我知道你很好，我真的爱你，可能这辈子作孽太多，没有福分和你在一起，因为我没结婚的时候就笃定的认为婚姻是命中注定的，后来也在网上看到只有福报相当的人才能结为夫妻，没能和你在一起大概福报不够吧，可我真的不甘心啊，有缘的夫妻不费劲就能走到一起，不管善缘还是恶缘，没缘的人想尽一切办法，用尽力气也换不来一世夫妻，知道想多了也没用，但是就是忍不住想你
			</div>
			<div class="main_article_button">
				<button class="button button-rounded button-tiny">
					删除
				</button >
				<button class="button button-rounded button-tiny">查看详情</button>
			</div>
		</div>


	</div>

	<script src="js/jquery-1.11.0.min.js" type="text/javascript"></script>
	<script src='js/velocity.min.js'></script>
	<script src='js/sideToggleExtended.js'></script>
	<script src="js/jquery.cookie.js"></script>
	<script type="text/javascript">
		$(document).ready(function() {
			$('#sideMenu').sideToggle({
				moving: '#sideMenuContainer',
				direction: 'right'
			});

            var username=$.cookie('username');
            if(username!=null){
                $('.Person_Center_Username').hide();
                $('.Person_Center_Cookie').show();
                $('.Person_Center_Cookie').html(username);
            }
		});
	</script>

</body>

</html>
