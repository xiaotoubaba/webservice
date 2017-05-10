package com.app.application.entity;

public class ErrMsg {

	private int code;
	private String msg;

	public static final int SUCC_CODE = 0;
	public static final int FAIL_CODE = -1;
	public static final String SUCC = "成功";
	public static final String FAIL = "请求异常";

	public static final ErrMsg SUCCESS = new ErrMsg(0, "成功");
	public static final ErrMsg FAILURE = new ErrMsg(-1, "请求异常");

	// 400 错误请求 — 请求中有语法问题，或不能满足请求
	public static final ErrMsg REQUSET_EMPTY = new ErrMsg(-400001, "请求不能为空");
	public static final ErrMsg REQUSET_PARAM_EMPTY = new ErrMsg(-400002, "param不能为空");
	public static final ErrMsg SESSION_EMPTY = new ErrMsg(-400003, "session不能为空");
	public static final ErrMsg AREA_ID_EMPTY = new ErrMsg(-400010, "area id不能为空");
	public static final ErrMsg COMMENT_EMPTY = new ErrMsg(-400011, "comment不能为空");
	public static final ErrMsg TYPE_ERR = new ErrMsg(-400012, "type值有误");
	public static final ErrMsg ALARM_STATUS_ERR = new ErrMsg(-400013, "报警状态有误");
	public static final ErrMsg START_TIME_ERR = new ErrMsg(-400014, "开始时间有误");
	public static final ErrMsg END_TIME_ERR = new ErrMsg(-400015, "结束时间有误");
	public static final ErrMsg START_GT_END_TIME_ERR = new ErrMsg(-400016, "开始时间必须在结束时间之前");
	public static final ErrMsg STORE_ID_EMPTY = new ErrMsg(-400017, "store id不能为空");
	public static final ErrMsg TARGET_OS_EMPTY = new ErrMsg(-400018, "target_os不能为空");
	public static final ErrMsg DEV_ID_EMPTY = new ErrMsg(-400019, "device id不能为空");
	public static final ErrMsg CLINET_ID_EMPTY = new ErrMsg(-400020, "client id不能为空");
	public static final ErrMsg STORAGE_ID_ILLEGAL = new ErrMsg(-400021, "storage id非法");
	public static final ErrMsg CHANNEL_ID_EMPTY = new ErrMsg(-400022, "channel id不能为空");
	public static final ErrMsg ATTR_EMPTY = new ErrMsg(-400023, "attr不能为空");
	public static final ErrMsg ATTR_EMPTY_2 = new ErrMsg(-400024, "返回attr为空");
	public static final ErrMsg ATTR_TIME_FORMAT_ERR = new ErrMsg(-400025, "attr日期格式有误");
	public static final ErrMsg ATTR_TIME_VALUE_ERR = new ErrMsg(-400026, "attr日期值设置有误");
	public static final ErrMsg ATTR_ERR = new ErrMsg(-400027, "属性设置有误");
	public static final ErrMsg PARAM_REQ_EMPTY = new ErrMsg(-400028, "req不能为空");
	public static final ErrMsg PARAM_REQ_METHOD_EMPTY = new ErrMsg(-400029, "req的method不能为空");
	public static final ErrMsg PARAM_REQ_PARAM_EMPTY = new ErrMsg(-400030, "req的param不能为空");
	public static final ErrMsg PARAM_REQ_PARAM_ERR = new ErrMsg(-400031, "req的param必须是json格式");
	public static final ErrMsg TZ_EMPTY = new ErrMsg(-400032, "tz不能为空");
	public static final ErrMsg USER_EMPTY = new ErrMsg(-400033, "user不能为空");
	public static final ErrMsg STREAM_ID_EMPTY = new ErrMsg(-400034, "stream id不能为空");
	public static final ErrMsg PHONE_ID_EMPTY = new ErrMsg(-400035, "phone id不能为空");
	public static final ErrMsg OLD_PWD_EMPTY = new ErrMsg(-400036, "旧密码不能为空");
	public static final ErrMsg NEW_PWD_EMPTY = new ErrMsg(-400037, "新密码不能为空");
	public static final ErrMsg PARAM_REQ_ERR = new ErrMsg(-400038, "req必须是json格式");
	public static final ErrMsg DEV_ID_ILLEGAL = new ErrMsg(-400039, "device id非法");
	public static final ErrMsg RECEIVEMSG_EMPTY = new ErrMsg(-400040, "receive_msg缺失");
	public static final ErrMsg DEV_TYPE_EMPTY = new ErrMsg(-400041, "dev type缺失");
	public static final ErrMsg DEV_TYPE_ILLEGAL = new ErrMsg(-400041, "dev type不合法");
	public static final ErrMsg FILE_EMPTY = new ErrMsg(-400042, "file缺失");
	public static final ErrMsg VIDEO_TYPE_EMPTY = new ErrMsg(-400043, "video type缺失");
	public static final ErrMsg VIDEO_TYPE_ILLEGAL = new ErrMsg(-400044, "video type不合法");
	public static final ErrMsg ACCESS_TOKEN_EMPTY = new ErrMsg(-400045, "access token不能为空");
	public static final ErrMsg BAIDU_PLAY_TYPE_ERROR = new ErrMsg(-400046, "type不合法");
	public static final ErrMsg PASSWORD_EMPTY = new ErrMsg(-400047, "password不能为空");
	public static final ErrMsg USER_ALREADY_EXIST = new ErrMsg(-400048, "用户已存在");
	public static final ErrMsg EMAIL_ERROR = new ErrMsg(-400049, "邮箱格式有误");
	public static final ErrMsg MOBILE_ERROR = new ErrMsg(-400050, "手机号码格式有误");
	public static final ErrMsg GENDER_ERROR = new ErrMsg(-400051, "性别有误");
	public static final ErrMsg NAME_TOO_LONG = new ErrMsg(-400052, "姓名太长");
	public static final ErrMsg ACCOUNT_GUID_EMPTY = new ErrMsg(-400053, "账号GUID不能为空");
	public static final ErrMsg CHANNEL_NUM_ILLEGAL = new ErrMsg(-400054, "通道数不合法");

	// 403 禁止 — 即使有授权也不需要访问
	public static final ErrMsg NO_PERMISSION = new ErrMsg(-403001, "用户无操作权限");

	// 404 找不到 — 服务器找不到给定的资源；文档不存在
	public static final ErrMsg ALARM_NOT_EXIST = new ErrMsg(-404010, "报警记录不存在");
	public static final ErrMsg NO_VERSION_FOR_OS = new ErrMsg(-404011, "无任何版本对应此target_os或target_os不存在");
	public static final ErrMsg STORE_NOT_EXIST = new ErrMsg(-404012, "店铺不存在");
	public static final ErrMsg DEV_NOT_EXIST = new ErrMsg(-404013, "设备不存在");
	public static final ErrMsg SERVER_TYPE_ERR = new ErrMsg(-404014, "server type不存在");
	public static final ErrMsg SERVER_TYPE_NOT_EXIST = new ErrMsg(-404015, "server类型不存在");
	public static final ErrMsg SERVER_NOT_EXIST = new ErrMsg(-404016, "server不存在");
	public static final ErrMsg USER_NOT_EXIST = new ErrMsg(-404017, "用户不存在");
	public static final ErrMsg ACCESS_TOKEN_NOT_EXIST = new ErrMsg(-404018, "AccessToken不存在");
	public static final ErrMsg USER_DOMAIN_NOT_FOUND = new ErrMsg(-404019, "用户信息错误，不属于任何运营商");

	// 406
	public static final ErrMsg LOGIN_FAIL = new ErrMsg(-406010, "登录失败");
	public static final ErrMsg SESSION_USER_ID_EMPTY = new ErrMsg(-406011, "无效的session，session已被注销或不存在");
	public static final ErrMsg PASSWORD_ERR = new ErrMsg(-406012, "密码错误");
	public static final ErrMsg DEVICE_OFFLINE = new ErrMsg(-406013, "设备不在线");
	public static final ErrMsg SESSION_NOT_EXIST = new ErrMsg(-406014, "session不存在");
	public static final ErrMsg ACCOUNT_NOT_EXIST = new ErrMsg(-406015, "session对应的账号信息不存在");
	public static final ErrMsg SERVER_ALREADY_EXIST = new ErrMsg(-406016, "server已经存在");
	public static final ErrMsg SERVER_EXIST_IN_DB = new ErrMsg(-406017, "server在数据库仍然存在");
	public static final ErrMsg STORE_IS_CLOSED = new ErrMsg(-406018, "店铺未开通服务");
	public static final ErrMsg OLD_PWD_INVALID = new ErrMsg(-406019, "原密码错误");
	public static final ErrMsg PROTECT_OPTION_FAILED = new ErrMsg(-406020, "布撤防失败,无在线设备");
	public static final ErrMsg ACCOUNT_ALREADY_EXIST = new ErrMsg(-406021, "用户名已经存在");

	// 407 代理认证请求 — 客户机首先必须使用代理认证自身。
	public static final ErrMsg EXCEED_ACCESS_LIMIT = new ErrMsg(-407001, "接口访问太频繁！");

	// 500 内部错误 — 因为意外情况，服务器不能完成请求
	public static final ErrMsg PUSH_TO_DEVICE_ERR = new ErrMsg(-500010, "设备服务器无响应");
	public static final ErrMsg READ_PUSH_TO_DEVICE_ERR = new ErrMsg(-500011, "设备响应异常");
	public static final ErrMsg READ_SESSION_ERR = new ErrMsg(-500012, "读取session异常");
	public static final ErrMsg INSERT_ALARM_NOTE_ERR = new ErrMsg(-500013, "插入报警处理记录异常");
	public static final ErrMsg UPDATET_ALARM_STATUS_ERR = new ErrMsg(-500014, "更新报警状态异常");
	public static final ErrMsg SAVE_SESSION_ERR = new ErrMsg(-500015, "保存用户session异常");
	public static final ErrMsg REMOVE_SESSION_ERR = new ErrMsg(-500016, "移除session异常");
	public static final ErrMsg GET_PUBLISH_URL_ERR = new ErrMsg(-500017, "流媒体服务器无响应");
	public static final ErrMsg GET_PLAY_URL_ERR = new ErrMsg(-500018, "流媒体服务器无响应");
	public static final ErrMsg GET_VOICE_URL_ERR = new ErrMsg(-500019, "无法获取语音服务地址");
	public static final ErrMsg AUTHORITY_ILLEGAL_ERR = new ErrMsg(-500020, "权限验证失败");
	public static final ErrMsg SECRET_KEY_ERR = new ErrMsg(-500021, "密钥错误");
	public static final ErrMsg REGISTER_BAIDU_DEVICEID_TOKEN_ERR = new ErrMsg(-500022, "保存设备编号和token异常");
	public static final ErrMsg SECRET_KEY_TYPE_ERR = new ErrMsg(-500023, "密钥类型错误");
	public static final ErrMsg SECRET_KEY_FORMAT_ERR = new ErrMsg(-500024, "密钥格式错误");
	public static final ErrMsg ADD_USER_TOKEN_ERR = new ErrMsg(-500025, "更新用户token异常");
	public static final ErrMsg GET_USER_TOKEN_ERR = new ErrMsg(-500026, "获取用户token异常");
	public static final ErrMsg DEVICE_ALREADY_IN_USE = new ErrMsg(-500027, "设备已添被占用，不能重复添加");
	public static final ErrMsg DEVICE_ADD_SUCCESS_WITH_ERROR = new ErrMsg(-500028, "设备添加成功，但填写的设备信息存在错误，已忽略");
	public static final ErrMsg DEVICE_ADD_REMOVE_ERROR = new ErrMsg(-500028, "设备操作出现未知错误");
	public static final ErrMsg REGIST_ERROR = new ErrMsg(-500028, "用户注册失败");

	public ErrMsg(final int code, final String msg) {
		this.code = code;
		this.msg = msg;
	}

	public int getCode() {
		return this.code;
	}

	public void setCode(final int code) {
		this.code = code;
	}

	public String getMsg() {
		return this.msg;
	}

	public void setMsg(final String msg) {
		this.msg = msg;
	}
}
