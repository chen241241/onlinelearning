package com.ck.onlinelearning.dao;

import static com.ck.onlinelearning.dao.UserDynamicSqlSupport.*;
import static org.mybatis.dynamic.sql.SqlBuilder.*;

import com.ck.onlinelearning.entity.User;
import java.util.List;
import javax.annotation.Generated;
import org.apache.ibatis.annotations.DeleteProvider;
import org.apache.ibatis.annotations.InsertProvider;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.SelectProvider;
import org.apache.ibatis.annotations.UpdateProvider;
import org.apache.ibatis.type.JdbcType;
import org.mybatis.dynamic.sql.SqlBuilder;
import org.mybatis.dynamic.sql.delete.DeleteDSL;
import org.mybatis.dynamic.sql.delete.MyBatis3DeleteModelAdapter;
import org.mybatis.dynamic.sql.delete.render.DeleteStatementProvider;
import org.mybatis.dynamic.sql.insert.render.InsertStatementProvider;
import org.mybatis.dynamic.sql.render.RenderingStrategy;
import org.mybatis.dynamic.sql.select.MyBatis3SelectModelAdapter;
import org.mybatis.dynamic.sql.select.QueryExpressionDSL;
import org.mybatis.dynamic.sql.select.SelectDSL;
import org.mybatis.dynamic.sql.select.render.SelectStatementProvider;
import org.mybatis.dynamic.sql.update.MyBatis3UpdateModelAdapter;
import org.mybatis.dynamic.sql.update.UpdateDSL;
import org.mybatis.dynamic.sql.update.render.UpdateStatementProvider;
import org.mybatis.dynamic.sql.util.SqlProviderAdapter;

@Mapper
public interface UserMapper {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-03-21T15:33:52.999+08:00", comments="Source Table: user")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    long count(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-03-21T15:33:53+08:00", comments="Source Table: user")
    @DeleteProvider(type=SqlProviderAdapter.class, method="delete")
    int delete(DeleteStatementProvider deleteStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-03-21T15:33:53+08:00", comments="Source Table: user")
    @InsertProvider(type=SqlProviderAdapter.class, method="insert")
    int insert(InsertStatementProvider<User> insertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-03-21T15:33:53.001+08:00", comments="Source Table: user")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ResultMap("UserResult")
    User selectOne(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-03-21T15:33:53.001+08:00", comments="Source Table: user")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @Results(id="UserResult", value = {
        @Result(column="uid", property="uid", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="name", property="name", jdbcType=JdbcType.VARCHAR),
        @Result(column="nickname", property="nickname", jdbcType=JdbcType.VARCHAR),
        @Result(column="password", property="password", jdbcType=JdbcType.VARCHAR),
        @Result(column="pid", property="pid", jdbcType=JdbcType.INTEGER)
    })
    List<User> selectMany(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-03-21T15:33:53.002+08:00", comments="Source Table: user")
    @UpdateProvider(type=SqlProviderAdapter.class, method="update")
    int update(UpdateStatementProvider updateStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-03-21T15:33:53.003+08:00", comments="Source Table: user")
    default QueryExpressionDSL<MyBatis3SelectModelAdapter<Long>> countByExample() {
        return SelectDSL.selectWithMapper(this::count, SqlBuilder.count())
                .from(user);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-03-21T15:33:53.003+08:00", comments="Source Table: user")
    default DeleteDSL<MyBatis3DeleteModelAdapter<Integer>> deleteByExample() {
        return DeleteDSL.deleteFromWithMapper(this::delete, user);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-03-21T15:33:53.003+08:00", comments="Source Table: user")
    default int deleteByPrimaryKey(Integer uid_) {
        return DeleteDSL.deleteFromWithMapper(this::delete, user)
                .where(uid, isEqualTo(uid_))
                .build()
                .execute();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-03-21T15:33:53.004+08:00", comments="Source Table: user")
    default int insert(User record) {
        return insert(SqlBuilder.insert(record)
                .into(user)
                .map(uid).toProperty("uid")
                .map(name).toProperty("name")
                .map(nickname).toProperty("nickname")
                .map(password).toProperty("password")
                .map(pid).toProperty("pid")
                .build()
                .render(RenderingStrategy.MYBATIS3));
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-03-21T15:33:53.004+08:00", comments="Source Table: user")
    default int insertSelective(User record) {
        return insert(SqlBuilder.insert(record)
                .into(user)
                .map(uid).toPropertyWhenPresent("uid", record::getUid)
                .map(name).toPropertyWhenPresent("name", record::getName)
                .map(nickname).toPropertyWhenPresent("nickname", record::getNickname)
                .map(password).toPropertyWhenPresent("password", record::getPassword)
                .map(pid).toPropertyWhenPresent("pid", record::getPid)
                .build()
                .render(RenderingStrategy.MYBATIS3));
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-03-21T15:33:53.005+08:00", comments="Source Table: user")
    default QueryExpressionDSL<MyBatis3SelectModelAdapter<List<User>>> selectByExample() {
        return SelectDSL.selectWithMapper(this::selectMany, uid, name, nickname, password, pid)
                .from(user);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-03-21T15:33:53.005+08:00", comments="Source Table: user")
    default QueryExpressionDSL<MyBatis3SelectModelAdapter<List<User>>> selectDistinctByExample() {
        return SelectDSL.selectDistinctWithMapper(this::selectMany, uid, name, nickname, password, pid)
                .from(user);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-03-21T15:33:53.005+08:00", comments="Source Table: user")
    default User selectByPrimaryKey(Integer uid_) {
        return SelectDSL.selectWithMapper(this::selectOne, uid, name, nickname, password, pid)
                .from(user)
                .where(uid, isEqualTo(uid_))
                .build()
                .execute();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-03-21T15:33:53.006+08:00", comments="Source Table: user")
    default UpdateDSL<MyBatis3UpdateModelAdapter<Integer>> updateByExample(User record) {
        return UpdateDSL.updateWithMapper(this::update, user)
                .set(uid).equalTo(record::getUid)
                .set(name).equalTo(record::getName)
                .set(nickname).equalTo(record::getNickname)
                .set(password).equalTo(record::getPassword)
                .set(pid).equalTo(record::getPid);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-03-21T15:33:53.006+08:00", comments="Source Table: user")
    default UpdateDSL<MyBatis3UpdateModelAdapter<Integer>> updateByExampleSelective(User record) {
        return UpdateDSL.updateWithMapper(this::update, user)
                .set(uid).equalToWhenPresent(record::getUid)
                .set(name).equalToWhenPresent(record::getName)
                .set(nickname).equalToWhenPresent(record::getNickname)
                .set(password).equalToWhenPresent(record::getPassword)
                .set(pid).equalToWhenPresent(record::getPid);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-03-21T15:33:53.007+08:00", comments="Source Table: user")
    default int updateByPrimaryKey(User record) {
        return UpdateDSL.updateWithMapper(this::update, user)
                .set(name).equalTo(record::getName)
                .set(nickname).equalTo(record::getNickname)
                .set(password).equalTo(record::getPassword)
                .set(pid).equalTo(record::getPid)
                .where(uid, isEqualTo(record::getUid))
                .build()
                .execute();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-03-21T15:33:53.007+08:00", comments="Source Table: user")
    default int updateByPrimaryKeySelective(User record) {
        return UpdateDSL.updateWithMapper(this::update, user)
                .set(name).equalToWhenPresent(record::getName)
                .set(nickname).equalToWhenPresent(record::getNickname)
                .set(password).equalToWhenPresent(record::getPassword)
                .set(pid).equalToWhenPresent(record::getPid)
                .where(uid, isEqualTo(record::getUid))
                .build()
                .execute();
    }
}