<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="zh">

<head>
	<meta charset="UTF-8">
	<meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
	<meta name="viewport" content="width=device-width, initial-scale=1.0">
	<title>个人中心 发布</title>
	<script src="http://cdn.bootcss.com/jquery/1.11.1/jquery.min.js"></script>
	<link href="images/shu.png" rel="shortcut icon" />
	<link rel="stylesheet" href="http://cdn.bootcss.com/bootstrap/3.3.0/css/bootstrap.min.css">
	<script src="http://cdn.bootcss.com/bootstrap/3.3.0/js/bootstrap.min.js"></script>
	<link rel="stylesheet" type="text/css" href="css/normalize.css" />
	<link rel="stylesheet" type="text/css" href="css/demo.css">
	<link href="css/font-awesome.min.css" rel="stylesheet">
	<link rel="stylesheet" href="css/style1.css">
	<link href="css/buttons.css" rel="stylesheet">


</head>

<body>

<nav>
	<a href="#" id="userPLink">
        <span class="Person_Center_Username">名字</span>
        <span class="Person_Center_Cookie"></span>
	</a>
	<div id="sideMenu">
		<span class="fa fa-navicon" id="sideMenuClosed"></span>
	</div>
</nav>


<div id="sideMenuContainer">
	<h2>个人中心</h2>
	<a href="post_center" title="查看发言 "><span class="fa fa-bolt"></span></a>
	<a href="Person_Center_publish.jsp" title="发布"><span class="fa fa-exclamation-circle"></span></a>
	<a href="post" title="返回首页"><span class="fa fa-home"></span></a>
</div>

<!--中间-->
<main class="main container clearfix">

	<section class="article-view">
		<h2 class="article-title">
			Posts
		</h2>
		<div class="block">
			<div>
				<form id="my_From" method="post" action="publishpost">
					<table>
						<tbody>
						<tr>
							<td>
								标题:
							</td>
							<td>
								<input name="post.title" class="init" maxlength="15" type="text" placeholder="Title" style="border-radius: 10px;height: 35px;width: 200px;margin: 10px 0;outline: none;">
							</td>
							<td>
							</td>
						</tr>
						<tr>
							<td>
								内容:
							</td>
							<td>
								<textarea id="md_editor" name="post.text" class="init" maxlength="100" rows="4" style="border-radius: 10px; width: 500px;height: 200px;margin: 10px 0px;
										outline: none;resize: none;"></textarea>
							</td>
						</tr>
						<tr>
							<td>

							</td>
							<td>
								<button class="btn" style="margin: 10px 0;">发布</button>
							</td>
						</tr>

						</tbody>
					</table>
				</form>
			</div>
		</div>

	</section>
</main>

<script src='js/velocity.min.js'></script>
<script src='js/sideToggleExtended.js'></script>
<script src="js/jquery.cookie.js"></script>
<script type="text/javascript" src="js/mditor.js"></script>
<script type="text/javascript" src="js/Person_Center_publish.js"></script>
<script type="text/javascript">
  /*  var Error_msg;
    $(document).ready(function() {
        $('#sideMenu').sideToggle({
            moving: '#sideMenuContainer',
            direction: 'right'
        });
/!*
*    将名字  变成的用户名
* *!/
        var username=$.cookie('username');
        if(username!=null){
            $('.Person_Center_Username').hide();
            $('.Person_Center_Cookie').show();
            $('.Person_Center_Cookie').html(username);
        }

/!*
* 表单验证
* *!/
        $('#my_From input').blur(function () {
            $parent=$(this).parent();
            $parent.find(".onError").remove();
            if($(this).val()==''){
                Error_msg='输入标题不能为空';
                $parent.append('<span class="onError">'+Error_msg+'</span>');
            }else if($(this).val().length==15){
                Error_msg='标题不能超过15个字';
                $parent.append('<span class="onError">'+Error_msg+'</span>');
            }
        }).keyup(function () {
            $(this).triggerHandler('blur');
        }).focus(function () {
            $(this).triggerHandler('blur');
        })

		var textarea=$('#my_From textarea');
    $('.btn').on('click',function (event) {
        if(textarea.val()==''){
            alert("请输入内容");
            event.preventDefault();
        }else {
            $('.btn').submit();
        }
    })

    });

    var ele_textarea = document.getElementById('md_editor');
    var editor = new mditor(ele_textarea);*/
</script>
</body>
</html>
