#开发环境
jdk1.7+tomcat7+mysql5.6<br>
#使用的框架
spring+springmvc+mybatis

#uEditorDemo
百度富文本编辑器的完美整合到SSM框架中

第一步:从百度富文本编辑器官网下载源码,找到JSP文件下的lib文件夹,把jar添加上;<br>
第二步:拷贝需要加载的js,css等,放到指定的目录下;<br>
第三步:拷贝官方提供的java代码到指定的包下即可;<br>


#本项目参考其它的资料,做了两个富文本编辑器样式的显示

首先,导入sql文件,修改本地的数据库用户名和密码<br>
其次,导入项目到Eclipse中,修改db.properties数据库配置,运行该项目即可<br>

访问默认富文本编辑器风格的样式,url地址：http://localhost:8080/uEditorDemo/ueditor.html<br>
如下图显示如下:如完成图片的上传加上文字的说明功能的实现,点击保存跳转到图片显示的页面展示<br>

![Image text](https://github.com/shanewds/Image/blob/master/image/ueditor2-1.jpg)<br>

![Image text](https://github.com/shanewds/Image/blob/master/image/ueditor2-2.jpg)<br>

![Image text](https://github.com/shanewds/Image/blob/master/image/ueditor2-3.jpg)<br>



访问修改后的富文本编辑器风格的样式,可以对插入的图片可以进行设置 url地址：http://localhost:8080/uEditorDemo/neditor.html<br>
如下图显示如下:如完成图片的上传加上文字的说明功能的实现,点击保存跳转到图片显示的页面展示<br>
![Image text](https://github.com/shanewds/Image/blob/master/image/neditor2-2.jpg)<br>

![Image text](https://github.com/shanewds/Image/blob/master/image/neditor2-3.jpg)<br>
