package com.ck.onlinelearning.dao;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class PowerDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-03-21T15:33:53.008+08:00", comments="Source Table: power")
    public static final Power power = new Power();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-03-21T15:33:53.008+08:00", comments="Source field: power.pid")
    public static final SqlColumn<Integer> pid = power.pid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-03-21T15:33:53.008+08:00", comments="Source field: power.pname")
    public static final SqlColumn<String> pname = power.pname;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-03-21T15:33:53.008+08:00", comments="Source Table: power")
    public static final class Power extends SqlTable {
        public final SqlColumn<Integer> pid = column("pid", JDBCType.INTEGER);

        public final SqlColumn<String> pname = column("pname", JDBCType.VARCHAR);

        public Power() {
            super("power");
        }
    }
}