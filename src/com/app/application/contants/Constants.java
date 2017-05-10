package com.app.application.contants;

/**
 * @Description: 静态常量类
 * @author 迅维web端团队
 * @date Nov 13, 2014 1:21:25 PM
 * @version V1.0
 */
public class Constants {
	public static int orderNo = 10000;


	private static int mid = 0;

	/**
	 * 新建非超级管理员用户初始化项目名称
	 */
	public static String INIT_APP_NAME = "农业溯源";

	public static String DIMENSION_CODE_INFIX = "/hami/access/qrcode.do?c=";

	private static String APPLICATION_CODE = "XUNWEISHI";
	/**
	 * 协议方法URL
	 */
	public static final String SERVER_METHOD_URL = "/govplatform-rs/";
	/**
	 * Web管理后台跟web业务服务器协议方法URL
	 */
	public static final String SERVER_LBS_METHOD_URL = "/govplatform-rs/lbs/";

	/**
	 * 视频播放相关协议方法URL
	 */
	public static final String SERVER_VIDEOPLAY_METHOD_URL = "/govplatform-rs/videoplay/";

	/**
	 * 设备更新URL(检查设备更新，升级设备)
	 */
	public static final String SERVER_DEVICE_COMMAND_URL = "/govplatform-rs/push/push_to_device/";

	/**
	 * 更改运营商云存储保存天数设置
	 */
	public static final String SERVER_SET_RETAIN_DAYS_URL = "/govplatform-rs/oss/set_retain_days";

	/**
	 * 获取设备上下线状态
	 */
	public static final String SERVER_DEVICE_STATE_URL = "/govplatform-rs/device_state/get_device_state/";

	/**
	 * 获取设备布撤防状态
	 */
	public static final String SERVER_DEVICE_PROTECT_STATE_URL = "/govplatform-rs/protect_state/get_protect_state/";

	/**
	 * 商铺布防URL
	 */
	public static final String OPEN_STORE_GURD_URL = "/govplatform-rs/protect_state/open_timer_protection/";
	/**
	 * 商铺撤防URL
	 */
	public static final String CLOSE_STORE_GURD_URL = "/govplatform-rs/protect_state/close_protection/";
	/**
	 * 服务器session
	 */
	public static final String SERVER_SESSION = "serverSession";
	/**
	 * 系统后台登录地址
	 */
	public static final String ADMIN_LOGIN_URL = "/system/login.do";
	/**
	 * 系统后台前缀
	 */
	public static final String ADMIN_PREFIX = "/system";
	/**
	 * 系统后台首页地址
	 */
	public static final String ADMIN_INDEX = "/mobile/index.do";

	public static final String MOBILE_LOGIN_URL = "/mobile/login.do";
	/**
	 * 系统后台前缀
	 */
	public static final String MOBILE_PREFIX = "/mobile";
	/**
	 * 系统后台首页地址
	 */
	public static final String MOBILE_INDEX = "/mobile/index.do";

	/**
	 * 安保中心后台登录地址
	 */
	public static final String DOMAIN_LOGIN_URL = "/domain/login.do";
	/**
	 * 安保中心后台首页地址
	 */
	public static final String DOMAIN_INDEX = "/domain/admin.do";

	/**
	 * 验证码名称
	 */
	public static final String CAPTCHA_PARAM = "captcha";

	/**
	 * 超级管理员的角色code
	 */
	public static final String SUPER_ADMIN_CODE = "super_admin";

	/**
	 * 管理员的角色code
	 */
	public static final String MANAGER_CODE = "manager";

	/**
	 * 技术员的角色code
	 */
	public static final String TECHNICIAN_CODE = "technician";

	/**
	 * 登录失败显示验证码的次数
	 */
	public static final Integer LOGIN_TRY_TIME = 3;

	/**
	 * 商铺用户角色
	 */
	public static final String STORE_OWNER_ROLE = "ROLE_STORE_OWNER";
	/**
	 * 运营商管理员角色
	 */
	public static final String OPERATOR_MANAGER_ROLE = "ROLE_OPERATOR_MANAGER";

	/**
	 * 表单日期格式
	 */
	public static final String INPUT_DATE_FORMAT = "yyyy-MM-dd";

	public static final String EXCEL_DATE_FORMAT = "yyyy.MM.dd";

	public static final String BUTTON_TEXT_SUBMIT = "保存";

	public static final String BUTTON_TEXT_SAVE = "提交";

	public static final String BUTTON_TEXT_DELETE = "删除";

	public static final String BUTTON_TEXT_ADD = "保存";

	public static final String MESSAGE_TYPE_SUCCESS = "info";

	public static final String MESSAGE_TYPE_ERROR = "danger";

	/**
	 * 设备管理 添加时使用的超级安保中心的id 默认是1
	 */
	public static final int domnid = 1;

	/**
	 * (新闻页面使用的七牛公有仓库的名字,特殊名字(名字以/开头的)请自行加@符号 比如 名字为/img.jpg的图片
	 * http://7te8dq.com1.z0.glb.clouddn.com/@/img.jpg )
	 */
	public static final String qiniuImgUrl = "http://o7tc68gzm.bkt.clouddn.com/";

	/**
	 * 在 @com.xunwei.govplatform.framework.shiro.SystemAuthenticationFilter.
	 * java的onLoginSuccess方法里使用 往session里塞当前登录的用户名
	 */
	public static final String LOGIN_USERNAME = "username";

	/**
	 * 经过一次MD5加密的密码
	 */
	public static final String LOGIN_MD5PASSWORD = "md5password";

	/**
	 * 配置在七牛上的图片缩放规则 修改为固定字符串 从数据库拿字段时替换成别的.
	 */
	public static final String mobileCopress = "";

	/**
	 * 在线浏览的缩略图缩放规则
	 */
	public static final String imageOnlineCompress = "-v001";

	public static int getMid() {
		if (mid > 2147483646)
			return mid = 0;
		else
			return ++mid;
	}

	public static int getOrderNo() {
		if (mid > 2147483646)
			return mid = 0;
		else
			return ++orderNo;
	}
}
