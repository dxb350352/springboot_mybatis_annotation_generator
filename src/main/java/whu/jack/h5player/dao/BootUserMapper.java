package whu.jack.h5player.dao;


import org.apache.ibatis.annotations.*;
import org.apache.ibatis.jdbc.SQL;
import whu.jack.h5player.model.BootUser;

import java.util.List;

public interface BootUserMapper {

    @SelectProvider(type = SqlProvider.class, method = "selectByBootUser")
    @ResultMap("BaseResultMap")
    List<BootUser> selectByBootUser(BootUser bootUser);

    @InsertProvider(type = SqlProvider.class, method = "insertBootUser")
    int insertBootUser(BootUser bootUser);

    @UpdateProvider(type = SqlProvider.class, method = "updateBootUser")
    int updateBootUser(BootUser bootUser);

    @DeleteProvider(type = SqlProvider.class, method = "deleteBootUser")
    int deleteBootUser(BootUser bootUser);


    class SqlProvider {

        public String selectByBootUser(BootUser bootUser) {
            SQL sql = new SQL().SELECT("*").FROM("`boot_user`");
            if (bootUser.getTestId() != null) sql.AND().WHERE("`test_id`=" + bootUser.getTestId());
            if (bootUser.getTenantId() != null) sql.AND().WHERE("`tenant_id`=" + bootUser.getTenantId());
            if (bootUser.getName() != null) sql.AND().WHERE("`name`='" + bootUser.getName() + "'");
            if (bootUser.getAge() != null) sql.AND().WHERE("`age`=" + bootUser.getAge());
            if (bootUser.getTestType() != null) sql.AND().WHERE("`test_type`=" + bootUser.getTestType());
            if (bootUser.getTestDate() != null) sql.AND().WHERE("`test_date`=" + bootUser.getTestDate());
            if (bootUser.getRole() != null) sql.AND().WHERE("`role`=" + bootUser.getRole());
            if (bootUser.getPhone() != null) sql.AND().WHERE("`phone`='" + bootUser.getPhone() + "'");

            return sql.toString();
        }

        public String insertBootUser(BootUser bootUser) {
            SQL sql = new SQL().INSERT_INTO("`boot_user`");
            if (bootUser.getTestId() != null) sql.VALUES("`test_id`", String.valueOf(bootUser.getTestId()));
            if (bootUser.getTenantId() != null) sql.VALUES("`tenant_id`", String.valueOf(bootUser.getTenantId()));
            if (bootUser.getName() != null) sql.VALUES("`name`", "'" + bootUser.getName() + "'");
            if (bootUser.getAge() != null) sql.VALUES("`age`", String.valueOf(bootUser.getAge()));
            if (bootUser.getTestType() != null) sql.VALUES("`test_type`", String.valueOf(bootUser.getTestType()));
            if (bootUser.getTestDate() != null) sql.VALUES("`test_date`", String.valueOf(bootUser.getTestDate()));
            if (bootUser.getRole() != null) sql.VALUES("`role`", String.valueOf(bootUser.getRole()));
            if (bootUser.getPhone() != null) sql.VALUES("`phone`", "'" + bootUser.getPhone() + "'");
            return sql.toString();
        }

        public String updateBootUser(BootUser bootUser) {
            SQL sql = new SQL().UPDATE("`boot_user`");
            if (bootUser.getTestId() != null) sql.SET("`test_id`=" + bootUser.getTestId());
            if (bootUser.getTenantId() != null) sql.SET("`tenant_id`=" + bootUser.getTenantId());
            if (bootUser.getName() != null) sql.SET("`name`='" + bootUser.getName() + "'");
            if (bootUser.getAge() != null) sql.SET("`age`=" + bootUser.getAge());
            if (bootUser.getTestType() != null) sql.SET("`test_type`=" + bootUser.getTestType());
            if (bootUser.getTestDate() != null) sql.SET("`test_date`=" + bootUser.getTestDate());
            if (bootUser.getRole() != null) sql.SET("`role`=" + bootUser.getRole());
            if (bootUser.getPhone() != null) sql.SET("`phone`='" + bootUser.getPhone() + "'");
            sql.WHERE("`test_id`=" + bootUser.getTestId());
            return sql.toString();
        }

        public String deleteBootUser(BootUser bootUser) {
            SQL sql = new SQL().DELETE_FROM("`boot_user`");
            if (bootUser.getTestId() != null) sql.AND().WHERE("`test_id`=" + bootUser.getTestId());
            if (bootUser.getTenantId() != null) sql.AND().WHERE("`tenant_id`=" + bootUser.getTenantId());
            if (bootUser.getName() != null) sql.AND().WHERE("`name`='" + bootUser.getName() + "'");
            if (bootUser.getAge() != null) sql.AND().WHERE("`age`=" + bootUser.getAge());
            if (bootUser.getTestType() != null) sql.AND().WHERE("`test_type`=" + bootUser.getTestType());
            if (bootUser.getTestDate() != null) sql.AND().WHERE("`test_date`=" + bootUser.getTestDate());
            if (bootUser.getRole() != null) sql.AND().WHERE("`role`=" + bootUser.getRole());
            if (bootUser.getPhone() != null) sql.AND().WHERE("`phone`='" + bootUser.getPhone() + "'");
            return sql.toString();
        }
    }

}