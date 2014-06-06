package es.tri.dao.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class TriTUsuariosExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TriTUsuariosExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        protected void addCriterionForJDBCDate(String condition, Date value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value.getTime()), property);
        }

        protected void addCriterionForJDBCDate(String condition, List<Date> values, String property) {
            if (values == null || values.size() == 0) {
                throw new RuntimeException("Value list for " + property + " cannot be null or empty");
            }
            List<java.sql.Date> dateList = new ArrayList<java.sql.Date>();
            Iterator<Date> iter = values.iterator();
            while (iter.hasNext()) {
                dateList.add(new java.sql.Date(iter.next().getTime()));
            }
            addCriterion(condition, dateList, property);
        }

        protected void addCriterionForJDBCDate(String condition, Date value1, Date value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value1.getTime()), new java.sql.Date(value2.getTime()), property);
        }

        public Criteria andId_usuarioIsNull() {
            addCriterion("id_usuario is null");
            return (Criteria) this;
        }

        public Criteria andId_usuarioIsNotNull() {
            addCriterion("id_usuario is not null");
            return (Criteria) this;
        }

        public Criteria andId_usuarioEqualTo(Integer value) {
            addCriterion("id_usuario =", value, "id_usuario");
            return (Criteria) this;
        }

        public Criteria andId_usuarioNotEqualTo(Integer value) {
            addCriterion("id_usuario <>", value, "id_usuario");
            return (Criteria) this;
        }

        public Criteria andId_usuarioGreaterThan(Integer value) {
            addCriterion("id_usuario >", value, "id_usuario");
            return (Criteria) this;
        }

        public Criteria andId_usuarioGreaterThanOrEqualTo(Integer value) {
            addCriterion("id_usuario >=", value, "id_usuario");
            return (Criteria) this;
        }

        public Criteria andId_usuarioLessThan(Integer value) {
            addCriterion("id_usuario <", value, "id_usuario");
            return (Criteria) this;
        }

        public Criteria andId_usuarioLessThanOrEqualTo(Integer value) {
            addCriterion("id_usuario <=", value, "id_usuario");
            return (Criteria) this;
        }

        public Criteria andId_usuarioIn(List<Integer> values) {
            addCriterion("id_usuario in", values, "id_usuario");
            return (Criteria) this;
        }

        public Criteria andId_usuarioNotIn(List<Integer> values) {
            addCriterion("id_usuario not in", values, "id_usuario");
            return (Criteria) this;
        }

        public Criteria andId_usuarioBetween(Integer value1, Integer value2) {
            addCriterion("id_usuario between", value1, value2, "id_usuario");
            return (Criteria) this;
        }

        public Criteria andId_usuarioNotBetween(Integer value1, Integer value2) {
            addCriterion("id_usuario not between", value1, value2, "id_usuario");
            return (Criteria) this;
        }

        public Criteria andId_tipo_usuarioIsNull() {
            addCriterion("id_tipo_usuario is null");
            return (Criteria) this;
        }

        public Criteria andId_tipo_usuarioIsNotNull() {
            addCriterion("id_tipo_usuario is not null");
            return (Criteria) this;
        }

        public Criteria andId_tipo_usuarioEqualTo(Integer value) {
            addCriterion("id_tipo_usuario =", value, "id_tipo_usuario");
            return (Criteria) this;
        }

        public Criteria andId_tipo_usuarioNotEqualTo(Integer value) {
            addCriterion("id_tipo_usuario <>", value, "id_tipo_usuario");
            return (Criteria) this;
        }

        public Criteria andId_tipo_usuarioGreaterThan(Integer value) {
            addCriterion("id_tipo_usuario >", value, "id_tipo_usuario");
            return (Criteria) this;
        }

        public Criteria andId_tipo_usuarioGreaterThanOrEqualTo(Integer value) {
            addCriterion("id_tipo_usuario >=", value, "id_tipo_usuario");
            return (Criteria) this;
        }

        public Criteria andId_tipo_usuarioLessThan(Integer value) {
            addCriterion("id_tipo_usuario <", value, "id_tipo_usuario");
            return (Criteria) this;
        }

        public Criteria andId_tipo_usuarioLessThanOrEqualTo(Integer value) {
            addCriterion("id_tipo_usuario <=", value, "id_tipo_usuario");
            return (Criteria) this;
        }

        public Criteria andId_tipo_usuarioIn(List<Integer> values) {
            addCriterion("id_tipo_usuario in", values, "id_tipo_usuario");
            return (Criteria) this;
        }

        public Criteria andId_tipo_usuarioNotIn(List<Integer> values) {
            addCriterion("id_tipo_usuario not in", values, "id_tipo_usuario");
            return (Criteria) this;
        }

        public Criteria andId_tipo_usuarioBetween(Integer value1, Integer value2) {
            addCriterion("id_tipo_usuario between", value1, value2, "id_tipo_usuario");
            return (Criteria) this;
        }

        public Criteria andId_tipo_usuarioNotBetween(Integer value1, Integer value2) {
            addCriterion("id_tipo_usuario not between", value1, value2, "id_tipo_usuario");
            return (Criteria) this;
        }

        public Criteria andPasswordIsNull() {
            addCriterion("Password is null");
            return (Criteria) this;
        }

        public Criteria andPasswordIsNotNull() {
            addCriterion("Password is not null");
            return (Criteria) this;
        }

        public Criteria andPasswordEqualTo(String value) {
            addCriterion("Password =", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotEqualTo(String value) {
            addCriterion("Password <>", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordGreaterThan(String value) {
            addCriterion("Password >", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordGreaterThanOrEqualTo(String value) {
            addCriterion("Password >=", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordLessThan(String value) {
            addCriterion("Password <", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordLessThanOrEqualTo(String value) {
            addCriterion("Password <=", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordLike(String value) {
            addCriterion("Password like", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotLike(String value) {
            addCriterion("Password not like", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordIn(List<String> values) {
            addCriterion("Password in", values, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotIn(List<String> values) {
            addCriterion("Password not in", values, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordBetween(String value1, String value2) {
            addCriterion("Password between", value1, value2, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotBetween(String value1, String value2) {
            addCriterion("Password not between", value1, value2, "password");
            return (Criteria) this;
        }

        public Criteria andFecha_bajaIsNull() {
            addCriterion("Fecha_baja is null");
            return (Criteria) this;
        }

        public Criteria andFecha_bajaIsNotNull() {
            addCriterion("Fecha_baja is not null");
            return (Criteria) this;
        }

        public Criteria andFecha_bajaEqualTo(Date value) {
            addCriterionForJDBCDate("Fecha_baja =", value, "fecha_baja");
            return (Criteria) this;
        }

        public Criteria andFecha_bajaNotEqualTo(Date value) {
            addCriterionForJDBCDate("Fecha_baja <>", value, "fecha_baja");
            return (Criteria) this;
        }

        public Criteria andFecha_bajaGreaterThan(Date value) {
            addCriterionForJDBCDate("Fecha_baja >", value, "fecha_baja");
            return (Criteria) this;
        }

        public Criteria andFecha_bajaGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("Fecha_baja >=", value, "fecha_baja");
            return (Criteria) this;
        }

        public Criteria andFecha_bajaLessThan(Date value) {
            addCriterionForJDBCDate("Fecha_baja <", value, "fecha_baja");
            return (Criteria) this;
        }

        public Criteria andFecha_bajaLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("Fecha_baja <=", value, "fecha_baja");
            return (Criteria) this;
        }

        public Criteria andFecha_bajaIn(List<Date> values) {
            addCriterionForJDBCDate("Fecha_baja in", values, "fecha_baja");
            return (Criteria) this;
        }

        public Criteria andFecha_bajaNotIn(List<Date> values) {
            addCriterionForJDBCDate("Fecha_baja not in", values, "fecha_baja");
            return (Criteria) this;
        }

        public Criteria andFecha_bajaBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("Fecha_baja between", value1, value2, "fecha_baja");
            return (Criteria) this;
        }

        public Criteria andFecha_bajaNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("Fecha_baja not between", value1, value2, "fecha_baja");
            return (Criteria) this;
        }

        public Criteria andUsuarioIsNull() {
            addCriterion("usuario is null");
            return (Criteria) this;
        }

        public Criteria andUsuarioIsNotNull() {
            addCriterion("usuario is not null");
            return (Criteria) this;
        }

        public Criteria andUsuarioEqualTo(String value) {
            addCriterion("usuario =", value, "usuario");
            return (Criteria) this;
        }

        public Criteria andUsuarioNotEqualTo(String value) {
            addCriterion("usuario <>", value, "usuario");
            return (Criteria) this;
        }

        public Criteria andUsuarioGreaterThan(String value) {
            addCriterion("usuario >", value, "usuario");
            return (Criteria) this;
        }

        public Criteria andUsuarioGreaterThanOrEqualTo(String value) {
            addCriterion("usuario >=", value, "usuario");
            return (Criteria) this;
        }

        public Criteria andUsuarioLessThan(String value) {
            addCriterion("usuario <", value, "usuario");
            return (Criteria) this;
        }

        public Criteria andUsuarioLessThanOrEqualTo(String value) {
            addCriterion("usuario <=", value, "usuario");
            return (Criteria) this;
        }

        public Criteria andUsuarioLike(String value) {
            addCriterion("usuario like", value, "usuario");
            return (Criteria) this;
        }

        public Criteria andUsuarioNotLike(String value) {
            addCriterion("usuario not like", value, "usuario");
            return (Criteria) this;
        }

        public Criteria andUsuarioIn(List<String> values) {
            addCriterion("usuario in", values, "usuario");
            return (Criteria) this;
        }

        public Criteria andUsuarioNotIn(List<String> values) {
            addCriterion("usuario not in", values, "usuario");
            return (Criteria) this;
        }

        public Criteria andUsuarioBetween(String value1, String value2) {
            addCriterion("usuario between", value1, value2, "usuario");
            return (Criteria) this;
        }

        public Criteria andUsuarioNotBetween(String value1, String value2) {
            addCriterion("usuario not between", value1, value2, "usuario");
            return (Criteria) this;
        }

        public Criteria andEmailIsNull() {
            addCriterion("email is null");
            return (Criteria) this;
        }

        public Criteria andEmailIsNotNull() {
            addCriterion("email is not null");
            return (Criteria) this;
        }

        public Criteria andEmailEqualTo(String value) {
            addCriterion("email =", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotEqualTo(String value) {
            addCriterion("email <>", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailGreaterThan(String value) {
            addCriterion("email >", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailGreaterThanOrEqualTo(String value) {
            addCriterion("email >=", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLessThan(String value) {
            addCriterion("email <", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLessThanOrEqualTo(String value) {
            addCriterion("email <=", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLike(String value) {
            addCriterion("email like", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotLike(String value) {
            addCriterion("email not like", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailIn(List<String> values) {
            addCriterion("email in", values, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotIn(List<String> values) {
            addCriterion("email not in", values, "email");
            return (Criteria) this;
        }

        public Criteria andEmailBetween(String value1, String value2) {
            addCriterion("email between", value1, value2, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotBetween(String value1, String value2) {
            addCriterion("email not between", value1, value2, "email");
            return (Criteria) this;
        }

        public Criteria andApellidoIsNull() {
            addCriterion("Apellido is null");
            return (Criteria) this;
        }

        public Criteria andApellidoIsNotNull() {
            addCriterion("Apellido is not null");
            return (Criteria) this;
        }

        public Criteria andApellidoEqualTo(String value) {
            addCriterion("Apellido =", value, "apellido");
            return (Criteria) this;
        }

        public Criteria andApellidoNotEqualTo(String value) {
            addCriterion("Apellido <>", value, "apellido");
            return (Criteria) this;
        }

        public Criteria andApellidoGreaterThan(String value) {
            addCriterion("Apellido >", value, "apellido");
            return (Criteria) this;
        }

        public Criteria andApellidoGreaterThanOrEqualTo(String value) {
            addCriterion("Apellido >=", value, "apellido");
            return (Criteria) this;
        }

        public Criteria andApellidoLessThan(String value) {
            addCriterion("Apellido <", value, "apellido");
            return (Criteria) this;
        }

        public Criteria andApellidoLessThanOrEqualTo(String value) {
            addCriterion("Apellido <=", value, "apellido");
            return (Criteria) this;
        }

        public Criteria andApellidoLike(String value) {
            addCriterion("Apellido like", value, "apellido");
            return (Criteria) this;
        }

        public Criteria andApellidoNotLike(String value) {
            addCriterion("Apellido not like", value, "apellido");
            return (Criteria) this;
        }

        public Criteria andApellidoIn(List<String> values) {
            addCriterion("Apellido in", values, "apellido");
            return (Criteria) this;
        }

        public Criteria andApellidoNotIn(List<String> values) {
            addCriterion("Apellido not in", values, "apellido");
            return (Criteria) this;
        }

        public Criteria andApellidoBetween(String value1, String value2) {
            addCriterion("Apellido between", value1, value2, "apellido");
            return (Criteria) this;
        }

        public Criteria andApellidoNotBetween(String value1, String value2) {
            addCriterion("Apellido not between", value1, value2, "apellido");
            return (Criteria) this;
        }

        public Criteria andNombreIsNull() {
            addCriterion("Nombre is null");
            return (Criteria) this;
        }

        public Criteria andNombreIsNotNull() {
            addCriterion("Nombre is not null");
            return (Criteria) this;
        }

        public Criteria andNombreEqualTo(String value) {
            addCriterion("Nombre =", value, "nombre");
            return (Criteria) this;
        }

        public Criteria andNombreNotEqualTo(String value) {
            addCriterion("Nombre <>", value, "nombre");
            return (Criteria) this;
        }

        public Criteria andNombreGreaterThan(String value) {
            addCriterion("Nombre >", value, "nombre");
            return (Criteria) this;
        }

        public Criteria andNombreGreaterThanOrEqualTo(String value) {
            addCriterion("Nombre >=", value, "nombre");
            return (Criteria) this;
        }

        public Criteria andNombreLessThan(String value) {
            addCriterion("Nombre <", value, "nombre");
            return (Criteria) this;
        }

        public Criteria andNombreLessThanOrEqualTo(String value) {
            addCriterion("Nombre <=", value, "nombre");
            return (Criteria) this;
        }

        public Criteria andNombreLike(String value) {
            addCriterion("Nombre like", value, "nombre");
            return (Criteria) this;
        }

        public Criteria andNombreNotLike(String value) {
            addCriterion("Nombre not like", value, "nombre");
            return (Criteria) this;
        }

        public Criteria andNombreIn(List<String> values) {
            addCriterion("Nombre in", values, "nombre");
            return (Criteria) this;
        }

        public Criteria andNombreNotIn(List<String> values) {
            addCriterion("Nombre not in", values, "nombre");
            return (Criteria) this;
        }

        public Criteria andNombreBetween(String value1, String value2) {
            addCriterion("Nombre between", value1, value2, "nombre");
            return (Criteria) this;
        }

        public Criteria andNombreNotBetween(String value1, String value2) {
            addCriterion("Nombre not between", value1, value2, "nombre");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}