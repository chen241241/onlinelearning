package com.ck.onlinelearning.dao;

import static com.ck.onlinelearning.dao.PowerDynamicSqlSupport.*;
import static org.mybatis.dynamic.sql.SqlBuilder.*;

import com.ck.onlinelearning.entity.Power;
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
public interface PowerMapper {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-03-21T15:33:53.008+08:00", comments="Source Table: power")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    long count(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-03-21T15:33:53.008+08:00", comments="Source Table: power")
    @DeleteProvider(type=SqlProviderAdapter.class, method="delete")
    int delete(DeleteStatementProvider deleteStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-03-21T15:33:53.008+08:00", comments="Source Table: power")
    @InsertProvider(type=SqlProviderAdapter.class, method="insert")
    int insert(InsertStatementProvider<Power> insertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-03-21T15:33:53.008+08:00", comments="Source Table: power")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ResultMap("PowerResult")
    Power selectOne(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-03-21T15:33:53.008+08:00", comments="Source Table: power")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @Results(id="PowerResult", value = {
        @Result(column="pid", property="pid", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="pname", property="pname", jdbcType=JdbcType.VARCHAR)
    })
    List<Power> selectMany(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-03-21T15:33:53.008+08:00", comments="Source Table: power")
    @UpdateProvider(type=SqlProviderAdapter.class, method="update")
    int update(UpdateStatementProvider updateStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-03-21T15:33:53.008+08:00", comments="Source Table: power")
    default QueryExpressionDSL<MyBatis3SelectModelAdapter<Long>> countByExample() {
        return SelectDSL.selectWithMapper(this::count, SqlBuilder.count())
                .from(power);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-03-21T15:33:53.008+08:00", comments="Source Table: power")
    default DeleteDSL<MyBatis3DeleteModelAdapter<Integer>> deleteByExample() {
        return DeleteDSL.deleteFromWithMapper(this::delete, power);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-03-21T15:33:53.008+08:00", comments="Source Table: power")
    default int deleteByPrimaryKey(Integer pid_) {
        return DeleteDSL.deleteFromWithMapper(this::delete, power)
                .where(pid, isEqualTo(pid_))
                .build()
                .execute();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-03-21T15:33:53.008+08:00", comments="Source Table: power")
    default int insert(Power record) {
        return insert(SqlBuilder.insert(record)
                .into(power)
                .map(pid).toProperty("pid")
                .map(pname).toProperty("pname")
                .build()
                .render(RenderingStrategy.MYBATIS3));
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-03-21T15:33:53.009+08:00", comments="Source Table: power")
    default int insertSelective(Power record) {
        return insert(SqlBuilder.insert(record)
                .into(power)
                .map(pid).toPropertyWhenPresent("pid", record::getPid)
                .map(pname).toPropertyWhenPresent("pname", record::getPname)
                .build()
                .render(RenderingStrategy.MYBATIS3));
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-03-21T15:33:53.009+08:00", comments="Source Table: power")
    default QueryExpressionDSL<MyBatis3SelectModelAdapter<List<Power>>> selectByExample() {
        return SelectDSL.selectWithMapper(this::selectMany, pid, pname)
                .from(power);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-03-21T15:33:53.009+08:00", comments="Source Table: power")
    default QueryExpressionDSL<MyBatis3SelectModelAdapter<List<Power>>> selectDistinctByExample() {
        return SelectDSL.selectDistinctWithMapper(this::selectMany, pid, pname)
                .from(power);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-03-21T15:33:53.009+08:00", comments="Source Table: power")
    default Power selectByPrimaryKey(Integer pid_) {
        return SelectDSL.selectWithMapper(this::selectOne, pid, pname)
                .from(power)
                .where(pid, isEqualTo(pid_))
                .build()
                .execute();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-03-21T15:33:53.009+08:00", comments="Source Table: power")
    default UpdateDSL<MyBatis3UpdateModelAdapter<Integer>> updateByExample(Power record) {
        return UpdateDSL.updateWithMapper(this::update, power)
                .set(pid).equalTo(record::getPid)
                .set(pname).equalTo(record::getPname);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-03-21T15:33:53.009+08:00", comments="Source Table: power")
    default UpdateDSL<MyBatis3UpdateModelAdapter<Integer>> updateByExampleSelective(Power record) {
        return UpdateDSL.updateWithMapper(this::update, power)
                .set(pid).equalToWhenPresent(record::getPid)
                .set(pname).equalToWhenPresent(record::getPname);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-03-21T15:33:53.009+08:00", comments="Source Table: power")
    default int updateByPrimaryKey(Power record) {
        return UpdateDSL.updateWithMapper(this::update, power)
                .set(pname).equalTo(record::getPname)
                .where(pid, isEqualTo(record::getPid))
                .build()
                .execute();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-03-21T15:33:53.009+08:00", comments="Source Table: power")
    default int updateByPrimaryKeySelective(Power record) {
        return UpdateDSL.updateWithMapper(this::update, power)
                .set(pname).equalToWhenPresent(record::getPname)
                .where(pid, isEqualTo(record::getPid))
                .build()
                .execute();
    }
}