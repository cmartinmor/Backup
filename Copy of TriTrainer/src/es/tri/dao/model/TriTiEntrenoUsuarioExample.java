package es.tri.dao.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class TriTiEntrenoUsuarioExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TriTiEntrenoUsuarioExample() {
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

        public Criteria andId_entrenoIsNull() {
            addCriterion("id_entreno is null");
            return (Criteria) this;
        }

        public Criteria andId_entrenoIsNotNull() {
            addCriterion("id_entreno is not null");
            return (Criteria) this;
        }

        public Criteria andId_entrenoEqualTo(Integer value) {
            addCriterion("id_entreno =", value, "id_entreno");
            return (Criteria) this;
        }

        public Criteria andId_entrenoNotEqualTo(Integer value) {
            addCriterion("id_entreno <>", value, "id_entreno");
            return (Criteria) this;
        }

        public Criteria andId_entrenoGreaterThan(Integer value) {
            addCriterion("id_entreno >", value, "id_entreno");
            return (Criteria) this;
        }

        public Criteria andId_entrenoGreaterThanOrEqualTo(Integer value) {
            addCriterion("id_entreno >=", value, "id_entreno");
            return (Criteria) this;
        }

        public Criteria andId_entrenoLessThan(Integer value) {
            addCriterion("id_entreno <", value, "id_entreno");
            return (Criteria) this;
        }

        public Criteria andId_entrenoLessThanOrEqualTo(Integer value) {
            addCriterion("id_entreno <=", value, "id_entreno");
            return (Criteria) this;
        }

        public Criteria andId_entrenoIn(List<Integer> values) {
            addCriterion("id_entreno in", values, "id_entreno");
            return (Criteria) this;
        }

        public Criteria andId_entrenoNotIn(List<Integer> values) {
            addCriterion("id_entreno not in", values, "id_entreno");
            return (Criteria) this;
        }

        public Criteria andId_entrenoBetween(Integer value1, Integer value2) {
            addCriterion("id_entreno between", value1, value2, "id_entreno");
            return (Criteria) this;
        }

        public Criteria andId_entrenoNotBetween(Integer value1, Integer value2) {
            addCriterion("id_entreno not between", value1, value2, "id_entreno");
            return (Criteria) this;
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

        public Criteria andId_tipo_entrenoIsNull() {
            addCriterion("id_tipo_entreno is null");
            return (Criteria) this;
        }

        public Criteria andId_tipo_entrenoIsNotNull() {
            addCriterion("id_tipo_entreno is not null");
            return (Criteria) this;
        }

        public Criteria andId_tipo_entrenoEqualTo(Integer value) {
            addCriterion("id_tipo_entreno =", value, "id_tipo_entreno");
            return (Criteria) this;
        }

        public Criteria andId_tipo_entrenoNotEqualTo(Integer value) {
            addCriterion("id_tipo_entreno <>", value, "id_tipo_entreno");
            return (Criteria) this;
        }

        public Criteria andId_tipo_entrenoGreaterThan(Integer value) {
            addCriterion("id_tipo_entreno >", value, "id_tipo_entreno");
            return (Criteria) this;
        }

        public Criteria andId_tipo_entrenoGreaterThanOrEqualTo(Integer value) {
            addCriterion("id_tipo_entreno >=", value, "id_tipo_entreno");
            return (Criteria) this;
        }

        public Criteria andId_tipo_entrenoLessThan(Integer value) {
            addCriterion("id_tipo_entreno <", value, "id_tipo_entreno");
            return (Criteria) this;
        }

        public Criteria andId_tipo_entrenoLessThanOrEqualTo(Integer value) {
            addCriterion("id_tipo_entreno <=", value, "id_tipo_entreno");
            return (Criteria) this;
        }

        public Criteria andId_tipo_entrenoIn(List<Integer> values) {
            addCriterion("id_tipo_entreno in", values, "id_tipo_entreno");
            return (Criteria) this;
        }

        public Criteria andId_tipo_entrenoNotIn(List<Integer> values) {
            addCriterion("id_tipo_entreno not in", values, "id_tipo_entreno");
            return (Criteria) this;
        }

        public Criteria andId_tipo_entrenoBetween(Integer value1, Integer value2) {
            addCriterion("id_tipo_entreno between", value1, value2, "id_tipo_entreno");
            return (Criteria) this;
        }

        public Criteria andId_tipo_entrenoNotBetween(Integer value1, Integer value2) {
            addCriterion("id_tipo_entreno not between", value1, value2, "id_tipo_entreno");
            return (Criteria) this;
        }

        public Criteria andFecha_bajaIsNull() {
            addCriterion("fecha_baja is null");
            return (Criteria) this;
        }

        public Criteria andFecha_bajaIsNotNull() {
            addCriterion("fecha_baja is not null");
            return (Criteria) this;
        }

        public Criteria andFecha_bajaEqualTo(Date value) {
            addCriterionForJDBCDate("fecha_baja =", value, "fecha_baja");
            return (Criteria) this;
        }

        public Criteria andFecha_bajaNotEqualTo(Date value) {
            addCriterionForJDBCDate("fecha_baja <>", value, "fecha_baja");
            return (Criteria) this;
        }

        public Criteria andFecha_bajaGreaterThan(Date value) {
            addCriterionForJDBCDate("fecha_baja >", value, "fecha_baja");
            return (Criteria) this;
        }

        public Criteria andFecha_bajaGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("fecha_baja >=", value, "fecha_baja");
            return (Criteria) this;
        }

        public Criteria andFecha_bajaLessThan(Date value) {
            addCriterionForJDBCDate("fecha_baja <", value, "fecha_baja");
            return (Criteria) this;
        }

        public Criteria andFecha_bajaLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("fecha_baja <=", value, "fecha_baja");
            return (Criteria) this;
        }

        public Criteria andFecha_bajaIn(List<Date> values) {
            addCriterionForJDBCDate("fecha_baja in", values, "fecha_baja");
            return (Criteria) this;
        }

        public Criteria andFecha_bajaNotIn(List<Date> values) {
            addCriterionForJDBCDate("fecha_baja not in", values, "fecha_baja");
            return (Criteria) this;
        }

        public Criteria andFecha_bajaBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("fecha_baja between", value1, value2, "fecha_baja");
            return (Criteria) this;
        }

        public Criteria andFecha_bajaNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("fecha_baja not between", value1, value2, "fecha_baja");
            return (Criteria) this;
        }

        public Criteria andValoracionIsNull() {
            addCriterion("Valoracion is null");
            return (Criteria) this;
        }

        public Criteria andValoracionIsNotNull() {
            addCriterion("Valoracion is not null");
            return (Criteria) this;
        }

        public Criteria andValoracionEqualTo(Integer value) {
            addCriterion("Valoracion =", value, "valoracion");
            return (Criteria) this;
        }

        public Criteria andValoracionNotEqualTo(Integer value) {
            addCriterion("Valoracion <>", value, "valoracion");
            return (Criteria) this;
        }

        public Criteria andValoracionGreaterThan(Integer value) {
            addCriterion("Valoracion >", value, "valoracion");
            return (Criteria) this;
        }

        public Criteria andValoracionGreaterThanOrEqualTo(Integer value) {
            addCriterion("Valoracion >=", value, "valoracion");
            return (Criteria) this;
        }

        public Criteria andValoracionLessThan(Integer value) {
            addCriterion("Valoracion <", value, "valoracion");
            return (Criteria) this;
        }

        public Criteria andValoracionLessThanOrEqualTo(Integer value) {
            addCriterion("Valoracion <=", value, "valoracion");
            return (Criteria) this;
        }

        public Criteria andValoracionIn(List<Integer> values) {
            addCriterion("Valoracion in", values, "valoracion");
            return (Criteria) this;
        }

        public Criteria andValoracionNotIn(List<Integer> values) {
            addCriterion("Valoracion not in", values, "valoracion");
            return (Criteria) this;
        }

        public Criteria andValoracionBetween(Integer value1, Integer value2) {
            addCriterion("Valoracion between", value1, value2, "valoracion");
            return (Criteria) this;
        }

        public Criteria andValoracionNotBetween(Integer value1, Integer value2) {
            addCriterion("Valoracion not between", value1, value2, "valoracion");
            return (Criteria) this;
        }

        public Criteria andTiempoRunIsNull() {
            addCriterion("tiempoRun is null");
            return (Criteria) this;
        }

        public Criteria andTiempoRunIsNotNull() {
            addCriterion("tiempoRun is not null");
            return (Criteria) this;
        }

        public Criteria andTiempoRunEqualTo(Integer value) {
            addCriterion("tiempoRun =", value, "tiempoRun");
            return (Criteria) this;
        }

        public Criteria andTiempoRunNotEqualTo(Integer value) {
            addCriterion("tiempoRun <>", value, "tiempoRun");
            return (Criteria) this;
        }

        public Criteria andTiempoRunGreaterThan(Integer value) {
            addCriterion("tiempoRun >", value, "tiempoRun");
            return (Criteria) this;
        }

        public Criteria andTiempoRunGreaterThanOrEqualTo(Integer value) {
            addCriterion("tiempoRun >=", value, "tiempoRun");
            return (Criteria) this;
        }

        public Criteria andTiempoRunLessThan(Integer value) {
            addCriterion("tiempoRun <", value, "tiempoRun");
            return (Criteria) this;
        }

        public Criteria andTiempoRunLessThanOrEqualTo(Integer value) {
            addCriterion("tiempoRun <=", value, "tiempoRun");
            return (Criteria) this;
        }

        public Criteria andTiempoRunIn(List<Integer> values) {
            addCriterion("tiempoRun in", values, "tiempoRun");
            return (Criteria) this;
        }

        public Criteria andTiempoRunNotIn(List<Integer> values) {
            addCriterion("tiempoRun not in", values, "tiempoRun");
            return (Criteria) this;
        }

        public Criteria andTiempoRunBetween(Integer value1, Integer value2) {
            addCriterion("tiempoRun between", value1, value2, "tiempoRun");
            return (Criteria) this;
        }

        public Criteria andTiempoRunNotBetween(Integer value1, Integer value2) {
            addCriterion("tiempoRun not between", value1, value2, "tiempoRun");
            return (Criteria) this;
        }

        public Criteria andTiempoSwimIsNull() {
            addCriterion("tiempoSwim is null");
            return (Criteria) this;
        }

        public Criteria andTiempoSwimIsNotNull() {
            addCriterion("tiempoSwim is not null");
            return (Criteria) this;
        }

        public Criteria andTiempoSwimEqualTo(Integer value) {
            addCriterion("tiempoSwim =", value, "tiempoSwim");
            return (Criteria) this;
        }

        public Criteria andTiempoSwimNotEqualTo(Integer value) {
            addCriterion("tiempoSwim <>", value, "tiempoSwim");
            return (Criteria) this;
        }

        public Criteria andTiempoSwimGreaterThan(Integer value) {
            addCriterion("tiempoSwim >", value, "tiempoSwim");
            return (Criteria) this;
        }

        public Criteria andTiempoSwimGreaterThanOrEqualTo(Integer value) {
            addCriterion("tiempoSwim >=", value, "tiempoSwim");
            return (Criteria) this;
        }

        public Criteria andTiempoSwimLessThan(Integer value) {
            addCriterion("tiempoSwim <", value, "tiempoSwim");
            return (Criteria) this;
        }

        public Criteria andTiempoSwimLessThanOrEqualTo(Integer value) {
            addCriterion("tiempoSwim <=", value, "tiempoSwim");
            return (Criteria) this;
        }

        public Criteria andTiempoSwimIn(List<Integer> values) {
            addCriterion("tiempoSwim in", values, "tiempoSwim");
            return (Criteria) this;
        }

        public Criteria andTiempoSwimNotIn(List<Integer> values) {
            addCriterion("tiempoSwim not in", values, "tiempoSwim");
            return (Criteria) this;
        }

        public Criteria andTiempoSwimBetween(Integer value1, Integer value2) {
            addCriterion("tiempoSwim between", value1, value2, "tiempoSwim");
            return (Criteria) this;
        }

        public Criteria andTiempoSwimNotBetween(Integer value1, Integer value2) {
            addCriterion("tiempoSwim not between", value1, value2, "tiempoSwim");
            return (Criteria) this;
        }

        public Criteria andTiempoCycleIsNull() {
            addCriterion("tiempoCycle is null");
            return (Criteria) this;
        }

        public Criteria andTiempoCycleIsNotNull() {
            addCriterion("tiempoCycle is not null");
            return (Criteria) this;
        }

        public Criteria andTiempoCycleEqualTo(Integer value) {
            addCriterion("tiempoCycle =", value, "tiempoCycle");
            return (Criteria) this;
        }

        public Criteria andTiempoCycleNotEqualTo(Integer value) {
            addCriterion("tiempoCycle <>", value, "tiempoCycle");
            return (Criteria) this;
        }

        public Criteria andTiempoCycleGreaterThan(Integer value) {
            addCriterion("tiempoCycle >", value, "tiempoCycle");
            return (Criteria) this;
        }

        public Criteria andTiempoCycleGreaterThanOrEqualTo(Integer value) {
            addCriterion("tiempoCycle >=", value, "tiempoCycle");
            return (Criteria) this;
        }

        public Criteria andTiempoCycleLessThan(Integer value) {
            addCriterion("tiempoCycle <", value, "tiempoCycle");
            return (Criteria) this;
        }

        public Criteria andTiempoCycleLessThanOrEqualTo(Integer value) {
            addCriterion("tiempoCycle <=", value, "tiempoCycle");
            return (Criteria) this;
        }

        public Criteria andTiempoCycleIn(List<Integer> values) {
            addCriterion("tiempoCycle in", values, "tiempoCycle");
            return (Criteria) this;
        }

        public Criteria andTiempoCycleNotIn(List<Integer> values) {
            addCriterion("tiempoCycle not in", values, "tiempoCycle");
            return (Criteria) this;
        }

        public Criteria andTiempoCycleBetween(Integer value1, Integer value2) {
            addCriterion("tiempoCycle between", value1, value2, "tiempoCycle");
            return (Criteria) this;
        }

        public Criteria andTiempoCycleNotBetween(Integer value1, Integer value2) {
            addCriterion("tiempoCycle not between", value1, value2, "tiempoCycle");
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