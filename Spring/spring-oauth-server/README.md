#spring-oauth-server


<strong>Spring与OAuth2的整合</strong>

项目用Maven管理, 字符编码: UTF-8


使用的技术与版本号
<ol>
 <li>JDK (1.8.0_40)</li>
 <li>Servlet (3.1.0)</li>
 <li>Spring (4.1.6.RELEASE)</li>
 <li>Spring Security (4.0.4.RELEASE)</li>
 <li>spring-security-oauth2 (2.0.7.RELEASE)</li>
 <li>Log4j (1.2.14)</li>
 <li>MySQL (5.6.23)</li>
 <li>EhCache (2.0.4)</li>
</ol>
<hr/>

<strong>Java Config版本请访问Branch: <a href="http://git.oschina.net/shengzhao/spring-oauth-server/tree/config/">config</a></strong>

<strong>MongoDB版本请访问Branch: <a href="http://git.oschina.net/shengzhao/spring-oauth-server/tree/mongodb/">mongodb</a></strong>

<strong>OAuth2下一代身份认证授权协议OIDC实现: <a href="https://git.oschina.net/mkk/MyOIDC">MyOIDC</a></strong>
<hr/>
<h3>
   OAuth2客户端项目请访问 <a href="http://git.oschina.net/mkk/spring-oauth-client">spring-oauth-client</a>
</h3>
<h3>
   在线测试访问地址 <a href="https://andaily.com/spring-oauth-server/">https://andaily.com/spring-oauth-server/</a>
</h3>
<h4>
   Shiro与OLTU整合的OAuth2项目 <a href="http://git.oschina.net/mkk/oauth2-shiro">http://git.oschina.net/mkk/oauth2-shiro</a>
   (相比spring-oauth-server, 该项目入门门槛相对较低, 代码更加透明, 理解更容易,可扩展性更强, 且模块化开发)
</h4>
<hr/>

<p>
<strong>如何使用?</strong>
<ol>
<li>
项目是Maven管理的, 需要本地安装maven(开发用的maven版本号为3.1.0), 还有MySql(开发用的mysql版本号为5.6)
</li>
<li>
<a href="http://git.oschina.net/shengzhao/spring-oauth-server/repository/archive?ref=master">下载</a>(或clone)项目到本地
</li>
<li>
创建MySQL数据库(如数据库名oauth2), 并运行相应的SQL脚本(脚本文件位于others/database目录),
<br/>
   运行脚本的顺序: initial_db.ddl -> oauth.ddl -> initial_data.ddl
</li>
<li>
修改<a href="http://git.oschina.net/shengzhao/spring-oauth-server/blob/master/src/main/resources/spring-oauth-server.properties">spring-oauth-server.properties</a>(位于src/main/resources目录)中的数据库连接信息(包括username, password等)
</li>
<li>
将本地项目导入到IDE(如Intellij IDEA)中,配置Tomcat(或类似的servlet运行服务器), 并启动Tomcat(默认端口为8080);
<br/>
注意将项目的 contextPath(根路径) 设置为 'spring-oauth-server'.
<br/>
   另: 也可通过maven package命令将项目编译为war文件(spring-oauth-server.war),
         将war放在Tomcat中并启动(注意: 这种方式需要将spring-oauth-server.properties加入到classpath中并正确配置数据库连接信息).
</li>
<li>
参考<a href="http://git.oschina.net/shengzhao/spring-oauth-server/blob/master/others/oauth_test.txt">oauth_test.txt</a>(位于others目录)的内容并测试之(也可在浏览器中访问相应的地址,如: http://localhost:8080/spring-oauth-server).
</li>
</ol>
</p>


<hr/>
<strong>grant_type</strong>

说明OAuth2支持的grant_type(授权方式)与功能
<ol>
    <li><code>authorization_code</code> -- 授权码模式(即先登录获取code,再获取token)</li>
    <li><code>password</code> -- 密码模式(将用户名,密码传过去,直接获取token)</li>
    <li><code>refresh_token</code> -- 刷新access_token</li>
    <li><code>implicit</code> -- 简化模式(在redirect_uri 的Hash传递token; Auth客户端运行在浏览器中,如JS,Flash)</li>
    <li><code>client_credentials</code> -- 客户端模式(无用户,用户向客户端注册,然后客户端以自己的名义向'服务端'获取资源)</li>
</ol>



<hr/>
<strong>帮助与改进</strong>
<ol>
<li>
<p>
 与该项目相关的博客请访问 <a target="_blank" href="http://blog.csdn.net/monkeyking1987/article/details/16828059">http://blog.csdn.net/monkeyking1987/article/details/16828059</a>
</p>
</li>
<li>
<p>
 如果在使用过程中遇到特殊的问题(如:如何将oauth_code存入数据库),请访问项目的 <a href="http://git.oschina.net/shengzhao/spring-oauth-server/wikis/pages">Wiki</a> 
 与 <a href="http://git.oschina.net/shengzhao/spring-oauth-server/attach_files">附件</a>. 
 <br/>
 我会把大家反馈的问题解决办法添加在这里.
 <br/>
 若在这两个地方没有找到解决办法的,
 欢迎发邮件到<a href="mailto:shengzhao@shengzhaoli.com">shengzhao@shengzhaoli.com</a>一起讨论.
</p>
</li>

<li>
<p>
 如果在使用项目的过程中发现任何的BUG或者更好的提议, 建议将其提交到项目的 <a href="http://git.oschina.net/shengzhao/spring-oauth-server/issues">Issues</a> 中, 
 我会一直关注并不断改进项目. 
</p>
</li>
</ol>

<hr/>
<strong>功能扩展</strong>
<ol>
    <li>
        <code>oauth_code存入数据库的配置</code>,  请下载文件 <a href="http://git.oschina.net/shengzhao/spring-oauth-server/attach_files">oauth_code存入数据库的配置.jpg</a>
    </li>
    <li>
        <code>改变token过期的时间的配置</code>, 请下载文件<a href="http://git.oschina.net/shengzhao/spring-oauth-server/attach_files">改变token过期的时间的配置.jpg</a>
    </li>
    <li>
        <code>自定义 grant_type</code>, 默认情况支持的grant_type包括 [password,authorization_code,refresh_token,implicit], 若不需要其中的某些grant_type,
        则可以修改 oauth_client_details 表中的 authorized_grant_types 字段的值;
        <br/>
        若想把整个Oauth服务修改来只支持某些grant_type, 请修改 <i>security.xml</i>文件中的
        <label>oauth2:authorization-server</label> 中的内容,将对应的 grant_type 注释或删掉即可
    </li>
    <li>
        <p>
            <code>如何刷新access_token(refresh_token)</code>, 在通过客户端(如移动设备)登录成功后返回的数据如下
            <br/>
            <pre>{"access_token":"3420d0e0-ed77-45e1-8370-2b55af0a62e8","token_type":"bearer","refresh_token":"b36f4978-a172-4aa8-af89-60f58abe3ba1","expires_in":43199,"scope":"read write"}
            </pre>
            <br/>
            若需要刷新获取新的token(一般在 expires_in 有效期时间快到时), 请求的URL类似如下
            <br/>
            <pre>http://localhost:8080/oauth/token?client_id=mobile-client&client_secret=mobile&grant_type=refresh_token&refresh_token=b36f4978-a172-4aa8-af89-60f58abe3ba1
            </pre>
            <br/>
            注意: refresh_token 参数值必须与登录成功后获取的 refresh_token 一致, 且grant_type = refresh_token
            <br/>
            另: 刷新token 需要 ClientDetails 支持 refresh_token 类型的 grant_type (默认是支持的)
        </p>
    </li>
</ol>


<hr/>
<h3>开发计划</h3>
<p>
从 0.3版本开始将项目的所有计划的开发内容列出来, 方便大家跟进, 也欢迎你加入.
<br/>
项目的开发管理使用开源项目 <a href="http://git.oschina.net/mkk/andaily-developer">andaily-developer</a>.
</p>
<ul>
       <li>
            <p>
                Version: <strong>1.0</strong> [pending]
                <br/>
                Date: 2017-03-30 / ---
            </p>
            <ol>
                <li><p><del>implicit测试时 取消掉 client secret</del></p></li>
                <li><p>更新UI,为了更易理解与使用</p></li>
                <li><p>增加删除access_token API</p></li>
                <li><p>增加删除 refresh_token API</p></li>
                <li><p><del>增加校验 access_token API: /oauth/check_token</del></p></li>
                <li><p>---</p></li>
            </ol>
            <br/>
       </li>
       <li>
            <p>
                Version: <strong>0.6</strong> [finished]
                <br/>
                Date: 2016-07-07 / 2016-10-13
            </p>
            <ol>
                <li><p><del>(150) - 修改OAUTH错误时返回JSON数据</del></p></li>
                <li><p><del>(151) - 数据添加Ehcache缓存支持</del></p></li>
                <li><p><del>(158) - 对配置,代码必要的地方添加注释,方便理解</del></p></li>
                <li><p><del>添加OIDC协议文档</del></p></li>
            </ol>
            <br/>
       </li>
       <li>
            <p>
                Version: <strong>0.5</strong> [finished]
                <br/>
                Date: 2016-02-19 / 2016-06-02
            </p>
            <ol>
                <li><p><del>(118) - Add java-config(零配置) 的支持, 以及启用 新的注解</del></p></li>
                <li><p><del>(138) - OAuth 'token' Restful API</del></p></li>
                <li><p><del>(139) - User Overview/ user add/archive</del></p></li>
                <li><p><del>(143) - Add project API document</del></p></li>
                <li><p><del>(144) - Add MongoDB branch</del></p></li>
            </ol>
            <br/>
       </li>
       <li>
            <p>
                Version: <strong>0.4</strong> [finished]
                <br/>
                Date: 2015-11-09 / 2015-11-30
            </p>
            <ol>
                <li><p><del>(97) - Fix custom access_token_validity,refresh_token_validity issue(#5)</del></p></li>
                <li><p><del>(109) - 升级 spring-security-oauth2 的版本到 2.0.6以上, 目前是1.0.5 </del></p></li>
                <li><p><del>(113) - Upgrade spring, spring security version to > 4.0</del></p></li>
                <li><p><del>将项目添加到在线测试服务器</del></p></li>
                <li><p><del>(115) - Sync update spring-oauth-client version with spring-oauth-server</del></p></li>
                <li><p><del>(116) - Remove mybatis dependency</del></p></li>
                <li><p><del>Upgrade JAVA to 1.8; Servlet 3.0</del></p></li>
                <li><p><del>Oauth table add index </del></p></li>
            </ol>
       </li>
       <li>
            <p>
                Version: <strong>0.3</strong> [finished]
                <br/>
                Date: 2015-05-14 / 2015-06-07
            </p>
            <ol>
                <li><p>#73 - Upgrade 'spring-security-oauth2' version to '2.0.6.RELEASE' (current: 1.0.5.RELEASE)      [CANCELED]</p></li>
                <li><p><del>#74 - oauth mysql ddl add create_time,  default is now()  </del></p></li>
                <li><p><del>#75 - Add user information API, for <a href="http://git.oschina.net/mkk/spring-oauth-client"><code>spring-oauth-client</code></a> project use
                    <pre>
                    URL: /unity/user_info
                    Login: Yes (ROLE_UNITY)
                    Data Format: JSON

                    URL: /m/user_info
                    Login: Yes (ROLE_MOBILE)
                    Data Format: JSON
                    </pre>
                    </del></p>
                </li>
                <li><p><del>#77 - User add Privilege domain.
                                  Addition initial two user: unityuser(ROLE_UNITY),mobileuser("ROLE_MOBILE).
                                  If default user, return all privilegs, otherwise return specify privilege(s) </del></p></li>
                <li><p><del>#78 - Initial 'sprint-oauth-client' project(maven), add sub-modules</del></p></li>
                <li><p><del>#91 - User log4j replace logback dependency </del></p></li>
                <li><p><del>#92 - Add database table column description. (添加数据库表的字段说明) </del></p></li>
                <li><p><del>#93 - 将默认的 oauth_code存入数据库(当前是存入内存) </del></p></li>
                <li><p><del> spring-oauth-server project add Bootstrap CSS  </del></p></li>
                <li><p><del>#95 - Add 'client-details' management; create/delete, show testing links<del></p></li>

            </ol>
       </li>
</ul>
<br/>

<hr/>
<strong>数据库表字段说明</strong>
<p>
    在0.3版本中添加了<code>db_table_description.html</code>文件(位于/others目录), 用来说明数据库脚本文件<code>oauth.ddl</code>中各表,各字段的用途及使用场合.
    <br/>
    也可在线访问<a href="http://andaily.com/spring-oauth-server/db_table_description.html">http://andaily.com/spring-oauth-server/db_table_description.html</a>.
</p>


<hr/>
<strong>Project Log</strong>
<p>
    <ol>
        <li><p><em>2013-11-19</em>     Initial project, start push code</p></li>
        <li><p><em>2013-11-20</em>     发布<a href="http://git.oschina.net/shengzhao/spring-oauth-server/tree/0.1/">0.1</a>版本</p></li>
        <li><p><em>2015-05-06</em>        发布<a href="http://www.oschina.net/news/62176/spring-oauth-server-0-2">0.2</a>版本</p></li>
        <li><p><em>2015-05-27</em>      创建项目博客,访问地址 <a href="http://andaily.com/blog/?cat=19">http://andaily.com/blog/?cat=19</a></p></li>
        <li><p><em>2015-06-07</em>        发布<a href="http://git.oschina.net/shengzhao/spring-oauth-server/tree/0.3/">0.3</a>版本</p></li>
        <li><p>
            <em>2015-06-16</em>       添加github访问: <a href="https://github.com/monkeyk/spring-oauth-server">https://github.com/monkeyk/spring-oauth-server</a>,
            以后的更新将同步github与gitosc.
        </p></li>
        <li><p><em>2015-11-09</em>        开始开发 0.4-beta 版本</p></li>
        <li><p><em>2015-11-18</em>        发布 <a href="http://git.oschina.net/shengzhao/spring-oauth-server/tree/0.4-beta/">0.4-beta</a> 版本</p></li>
        <li><p><em>2016-01-02</em>        发布 <a href="http://git.oschina.net/shengzhao/spring-oauth-server/tree/0.4/">0.4</a> 版本</p></li>
        <li><p><em>2016-02-19</em>        Add 0.5 version development planning</p></li>
        <li><p><em>2016-04-03</em>        Add <a href="http://git.oschina.net/shengzhao/spring-oauth-server/tree/config/">config</a> branch</p></li>
        <li><p><em>2016-04-14</em>        Add <a href="http://git.oschina.net/shengzhao/spring-oauth-server/tree/mongodb/">mongodb</a> branch</p></li>
        <li><p><em>2016-06-02</em>        发布 <a href="http://git.oschina.net/shengzhao/spring-oauth-server/tree/0.5/">0.5</a> 版本</p></li>
        <li><p><em>2016-07-06</em>        Add 0.6 version planning</p></li>
        <li><p><em>2016-10-13</em>        发布0.6版本</p></li>
    </ol>
</p>


<hr/>
<strong>更多资源</strong>
<p>以下是在学习工作中收集的更多关于OAuth2的资源,对深入理解与运用OAuth2有帮助</p>
<ul>
       <li>
            <p>
                <a href="http://tools.ietf.org/html/rfc6749">RFC 6749 - The OAuth 2.0 Authorization Framework</a>, OAuth2.0协议(英文)
            </p>
       </li>
       <li>
            <p>
                <a href="http://oauth.net/2/">OAuth 2.0 &mdash; OAuth</a>, OAuth2.0官方网站
            </p>
       </li>
       <li>
            <p>
                <a href="http://netment.iteye.com/blog/945402">OAUTH2核心参数说明</a>, 重点介绍了grant_type 与 response_type 以及示例
            </p>
       </li>
       <li>
            <p>
                <a href="http://apiwiki.poken.com/authentication/oauth2">OAuth2 flows</a>, 详细介绍Oauth2的流程,各类错误发生时的响应
            </p>
       </li>
       <li>
            <p>
                <a href="http://www.oschina.net/translate/oauth-2-developers-guide">OAuth 2 开发人员指南（Spring security oauth2）</a>, 翻译OAuth 2 Developers Guide(spring security oauth2)
            </p>
       </li>
       <li>
            <p>
                <a href="http://www.ruanyifeng.com/blog/2014/05/oauth_2_0.html">理解OAuth 2.0</a>, 介绍Oauth2各类grant_type的使用
            </p>
       </li>
       <li>
            <p>
                <a href="http://www.dannysite.com/blog/178/">OAuth2：隐式授权（Implicit Grant）类型的开放授权</a>, 介绍grant_type='implicit'模式
            </p>
       </li>
       <li>
            <p>
                <a href="http://oltu.apache.org/">Apache Oltu</a>, Java版的 OAuth参考实现, 建议去了解了解
            </p>
       </li>
       <li>
            <p>
                <a href="http://andaily.com/blog/?p=440">OIDC–基于OAuth2的下一代身份认证授权协议</a>
            </p>
       </li>
       <li>
            <p>
                <a href="https://andaily.com/blog/?p=528">正确处理spring-oauth-server中在验证失败或错误时的方式</a>
            </p>
       </li>
</ul>


<hr/>
<h4>
    与项目相关的技术文章请访问 <a href="http://andaily.com/blog/?cat=19">http://andaily.com/blog/?cat=19</a> (不断更新与OAuth2相关的文章)
</h4>
<p>
    <strong>问答与讨论</strong>
    <br/>
    与项目相关的，与OAuth2相关的问题与回答，以及各类讨论请访问<br/>
    <a href="http://andaily.com/blog/?dwqa-question_category=oauth">http://andaily.com/blog/?dwqa-question_category=oauth</a>
</p>


<hr/>
<h4>使用案例</h4>
<p>以下是已知的使用(或基于) spring-oauth-server 开源项目的各类商业项目(排名不分先后), 若你有案例希望添加, 请联系作者.</p>
<ul>
    <li><p>Hongkong Parkway Online (在线医疗服务系统)</p></li>
    <li><p>海尔日日平台 (B2B电商平台)</p></li>
    <li><p>wdcy-game (手机游戏服务端)</p></li>
    <li><p>Honyee Management System (企业管理系统)</p></li>
    <li><p>AoLin Open Platform (国际物流开发平台)</p></li>
    <li><p>IDS (移动安全产品)</p></li>
    <li><p>IDP (统一身份认证平台)</p></li>
    <li><p>......</p></li>
</ul>


<hr/>
<div>
    <h3>捐助</h3>
    支付宝: monkeyking1987@126.com (**钊)
    <ul>
        <li><p>快意江湖 -- 100元</p></li>
        <li><p>yufan -- 100元</p></li>
        <li><p>强郑 -- 1元 (2016-09-07)</p></li>
        <li><p>建化 -- 5元 (2016-12-16)</p></li>
        <li><p>南京索特科技 -- 200元 (2016-12-16)</p></li>
        <li><p>周广文 -- 6.66元 (2017-02-17)</p></li>
        <li><p>境随心转 -- 20元 (2017-06-09)</p></li>
    </ul>
</div>

<hr/>
<p>
 关注更多我的开源项目请访问 <a href="https://andaily.com/my_projects.html">https://andaily.com/my_projects.html</a>
</p>

<p>
 若需更多的技术支持请联系 <a href="mailto:monkeyk@shengzhaoli.com">monkeyk@shengzhaoli.com</a>
</p>
<h3>
 <em>若需商业技术支持或提供技术解决方案, 请联系 <a href="mailto:sz@monkeyk.com">sz@monkeyk.com</a></em>
 或访问 <a href="https://monkeyk.com/kso/" target="_blank">https://monkeyk.com/kso/</a>
</h3>
<p>
    <img src="http://77g1is.com1.z0.glb.clouddn.com/wechat_qrcode.jpg"/>
</p>