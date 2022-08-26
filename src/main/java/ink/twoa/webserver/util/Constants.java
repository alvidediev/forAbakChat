package ink.twoa.webserver.util;

import lombok.experimental.UtilityClass;

@UtilityClass
public class Constants {
    public static final String SHOW_ALL_MESSAGES = "/api/v1/msg/getAll";
    public static final String GET_MESSAGE_BY_ID = "/api/v1/msg/get/{id}";

    public static final String SAVE_MESSAGE = "/api/v1/msg/add";

    public static final String SHOW_USERS = "api/v1/users/getAll";

    public static final String SAVE_USER = "api/v1/users/add";

    public static final String GET_USER_BY_ID = "/api/v1/users/get/{id}";

    public static final String DELETE_USER_BY_ID = "/api/v1/users/delete/{id}";

}
