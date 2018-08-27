<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="s" uri="/struts-tags" %>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<!DOCTYPE html>
<html class="root-view">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1, user-scalable=no">
    <title>树洞——你的心情驿站</title>
    <link href="images/shu.png" rel="shortcut icon" />
    <link rel="stylesheet" type="text/css" href="css/style.css">
    <link rel="stylesheet" type="text/css" href="css/media.css">
</head>
<body>
<!-- 头部 -->
<header class="header">
    <section class="header-top">
        <a href="" class="logo">
            <img src="images/shu.png" alt="">
            <span class="deng">登录</span>
        </a>
        <span class="welcome"><a href="post_center">伤天害理</a>，欢迎你</span>
        <span class="quit">退出</span>
        <span class="nav-switch"></span>
        <nav class="nav">
            <ul>
                <li class="on">
                    <a href="/hot"><img class="yao" src="images/好评.png" alt="热门"><p>热门</p></a>
                </li>
                <li>
                    <a href="showGoodPost"><img class="yao" src="images/火.png" alt=""><p>精华</p></a>
                </li>
                <li>
                    <a href="/post"><img src="images/最新.png" alt=""><p>最新</p></a>
                </li>
                <li>
                    <a href="Auditing" class="trial"><img src="images/发布评审_icon.png" alt=""><p>审帖</p></a>
                </li>
                <li>
                    <a href="Person_Center_publish.jsp" class="publish"><img src="images/发表游记.png" alt=""><p>发表</p></a>
                </li>
                <li>
                    <a href="post_center" class="personal"><img src="images/个人中心.png" alt=""><p>个人中心</p></a>
                </li>
            </ul>
            <p class="tips">请先登录，再进行骚操作</p>
        </nav>
    </section>
    <section class="header-bg" id="canvas">
        <section class="self-introduce container">
            <%--<p class="leave">树洞你的心灵驿站，让那些生活中不曾发出的声音，请把它留在这里</p>--%>
        </section>
    </section>
</header>
<!-- 中部 -->
<main class="main container clearfix">
    <section class="article-view">
        <h2 class="article-title">
            Posts
        </h2>
        <s:iterator value="posts">
            <div class="kuang">
                <ul class="article-list">
                    <li>
                        <div class="article-item">
                            <h3>
                            <span>Time :
                                <s:property value="publishedtime"/>
                            </span>
                                <s:if test="%{isboutique == true}">
                                    <s:property value="title"/><img class="jinP" src="images/精品.png" alt="">
                                </s:if>
                                <s:else>
                                    <s:property value="title"/>
                                </s:else>
                            <%--<s:property value="title"/> <img class="jinP" src="images/精品.png" alt="">--%>
                            </h3>
                            <p><s:property value="text"/></p>
                        </div>
                    </li>
                    <li class="xia">
                        <div class="zan">
                            <span class="jia1">👍 <b><s:property value="like"/></b></span>
                            <span class="jia2">👎 <b><s:property value="dislike"/></b></span>
                            <span class="comm-p">评论</span>
                            <span class="fenX">分享
								<div class="fen">
									<a href="">新浪微博</a>
									<a href="">QQ空间</a>
									<a href="">腾讯微博</a>
								</div>
							</span>
                            <input type="hidden" value="<s:property value="postid"/>">
                        </div>
                        <div class="comm">
                            <hr>
                            <ul class="list">
                                <s:iterator value="comments">
                                    <s:if test="c_postid==postid">
                                        <li><span><img src='images/f_noface.png' alt=''></span><span><s:property value="text"/></span></li><hr>
                                    </s:if>
                                </s:iterator>
                            </ul>
                            <input type="hidden" value="<s:property value="postid"/>">
                            <textarea name="textarea" class="ping" cols="30" rows="10">请不要发表与本内容无关的评论，您有了账号就是有身份的人了，我们可认识您。</textarea>
                            <button class="fa">发表</button>
                        </div>
                    </li>
                </ul>
            </div>
        </s:iterator>

        <section class="load-more">
            <a href="">加载更多</a>
        </section>
    </section>

    <section class="right-column">
        <section class="column-item">
            <h3>Music</h3>
            <section class="friends">
                <div class="music">
                    <div class="pic"><img class="img" src="images/g1.jpg" alt=""></div>
                    <div class="title tit">刚好遇见你</div>
                    <audio id="audio" src="mp3/1.mp3"></audio>
                    <div class="kong">
                        <span class="prev"></span>
                        <span class="play" id="fang"></span>
                        <span class="next"></span>
                    </div>
                </div>
            </section>
        </section>
        <section class=" column-item">
            <h3>Advertisement</h3>
            <section class="tags">
                <a href="">虚位以待的广告位</a>
            </section>
        </section>
        <section class="column-item">
            <h3>About me</h3>
            <section class="about-me">
                <img src="images/cover.gif">
                <p>今日的努力，仅为昨日的吹的牛逼!!!</p>
            </section>
        </section>
    </section>
</main>

<footer class="footer">Tree hole on 2018</footer>

<div id="box">
    <div class="zu"><a href="register.jsp">注册</a></div>
    <div class="qu">X</div>
    <div class="box">
        <form class="reg-form" id="reg-form" method="post">
            <label class="form-item">
                <strong>
                    <img src="images/zh.png" alt="">
                </strong>
                <div>
                    <input type="text" name="user.phone" maxlength="11" placeholder="账号为手机号">
                    <i></i>
                </div>
            </label>
            <label class="form-item">
                <strong>
                    <img src="images/mm.png" alt="">
                </strong>
                <div>
                    <input type="password" name="user.password" maxlength="16" placeholder="密码8-16位">
                    <i></i>
                </div>
            </label>
            <label class="form-item">
                <div class="sub-btn">
                    <button class="dlz">登录</button>
                </div>
            </label>
        </form>
    </div>
</div>
<script type="text/javascript" src="http://apps.bdimg.com/libs/jquery/1.11.1/jquery.js"></script>
<script type="text/javascript" src="js/biaodan.js"></script>
<script type="text/javascript" src="js/load.js"></script>
<script type="text/javascript" src="js/jquery.cookie.js"></script>
<script type="text/javascript" src="js/cookie.js"></script>
<script type="text/javascript" src="js/canvas.js"></script>
</body>
</html>