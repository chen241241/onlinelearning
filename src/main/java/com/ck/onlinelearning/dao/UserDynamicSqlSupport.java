package com.ck.onlinelearning.dao;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class UserDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-03-21T15:33:52.998+08:00", comments="Source Table: user")
    public static final User user = new User();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-03-21T15:33:52.998+08:00", comments="Source field: user.uid")
    public static final SqlColumn<Integer> uid = user.uid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-03-21T15:33:52.999+08:00", comments="Source field: user.name")
    public static final SqlColumn<String> name = user.name;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-03-21T15:33:52.999+08:00", comments="Source field: user.nickname")
    public static final SqlColumn<String> nickname = user.nickname;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-03-21T15:33:52.999+08:00", comments="Source field: user.password")
    public static final SqlColumn<String> password = user.password;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-03-21T15:33:52.999+08:00", comments="Source field: user.pid")
    public static final SqlColumn<Integer> pid = user.pid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-03-21T15:33:52.998+08:00", comments="Source Table: user")
    public static final class User extends SqlTable {
        public final SqlColumn<Integer> uid = column("`uid`", JDBCType.INTEGER);

        public final SqlColumn<String> name = column("`name`", JDBCType.VARCHAR);

        public final SqlColumn<String> nickname = column("nickname", JDBCType.VARCHAR);

        public final SqlColumn<String> password = column("`password`", JDBCType.VARCHAR);

        public final SqlColumn<Integer> pid = column("pid", JDBCType.INTEGER);

        public User() {
            super("user");
        }
    }
}