package es.tri.dao.model;

import java.util.ArrayList;
import java.util.List;

public class TriTEjerciciosExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TriTEjerciciosExample() {
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

        public Criteria andId_ejercicioIsNull() {
            addCriterion("id_ejercicio is null");
            return (Criteria) this;
        }

        public Criteria andId_ejercicioIsNotNull() {
            addCriterion("id_ejercicio is not null");
            return (Criteria) this;
        }

        public Criteria andId_ejercicioEqualTo(Integer value) {
            addCriterion("id_ejercicio =", value, "id_ejercicio");
            return (Criteria) this;
        }

        public Criteria andId_ejercicioNotEqualTo(Integer value) {
            addCriterion("id_ejercicio <>", value, "id_ejercicio");
            return (Criteria) this;
        }

        public Criteria andId_ejercicioGreaterThan(Integer value) {
            addCriterion("id_ejercicio >", value, "id_ejercicio");
            return (Criteria) this;
        }

        public Criteria andId_ejercicioGreaterThanOrEqualTo(Integer value) {
            addCriterion("id_ejercicio >=", value, "id_ejercicio");
            return (Criteria) this;
        }

        public Criteria andId_ejercicioLessThan(Integer value) {
            addCriterion("id_ejercicio <", value, "id_ejercicio");
            return (Criteria) this;
        }

        public Criteria andId_ejercicioLessThanOrEqualTo(Integer value) {
            addCriterion("id_ejercicio <=", value, "id_ejercicio");
            return (Criteria) this;
        }

        public Criteria andId_ejercicioIn(List<Integer> values) {
            addCriterion("id_ejercicio in", values, "id_ejercicio");
            return (Criteria) this;
        }

        public Criteria andId_ejercicioNotIn(List<Integer> values) {
            addCriterion("id_ejercicio not in", values, "id_ejercicio");
            return (Criteria) this;
        }

        public Criteria andId_ejercicioBetween(Integer value1, Integer value2) {
            addCriterion("id_ejercicio between", value1, value2, "id_ejercicio");
            return (Criteria) this;
        }

        public Criteria andId_ejercicioNotBetween(Integer value1, Integer value2) {
            addCriterion("id_ejercicio not between", value1, value2, "id_ejercicio");
            return (Criteria) this;
        }

        public Criteria andDescripcionIsNull() {
            addCriterion("Descripcion is null");
            return (Criteria) this;
        }

        public Criteria andDescripcionIsNotNull() {
            addCriterion("Descripcion is not null");
            return (Criteria) this;
        }

        public Criteria andDescripcionEqualTo(String value) {
            addCriterion("Descripcion =", value, "descripcion");
            return (Criteria) this;
        }

        public Criteria andDescripcionNotEqualTo(String value) {
            addCriterion("Descripcion <>", value, "descripcion");
            return (Criteria) this;
        }

        public Criteria andDescripcionGreaterThan(String value) {
            addCriterion("Descripcion >", value, "descripcion");
            return (Criteria) this;
        }

        public Criteria andDescripcionGreaterThanOrEqualTo(String value) {
            addCriterion("Descripcion >=", value, "descripcion");
            return (Criteria) this;
        }

        public Criteria andDescripcionLessThan(String value) {
            addCriterion("Descripcion <", value, "descripcion");
            return (Criteria) this;
        }

        public Criteria andDescripcionLessThanOrEqualTo(String value) {
            addCriterion("Descripcion <=", value, "descripcion");
            return (Criteria) this;
        }

        public Criteria andDescripcionLike(String value) {
            addCriterion("Descripcion like", value, "descripcion");
            return (Criteria) this;
        }

        public Criteria andDescripcionNotLike(String value) {
            addCriterion("Descripcion not like", value, "descripcion");
            return (Criteria) this;
        }

        public Criteria andDescripcionIn(List<String> values) {
            addCriterion("Descripcion in", values, "descripcion");
            return (Criteria) this;
        }

        public Criteria andDescripcionNotIn(List<String> values) {
            addCriterion("Descripcion not in", values, "descripcion");
            return (Criteria) this;
        }

        public Criteria andDescripcionBetween(String value1, String value2) {
            addCriterion("Descripcion between", value1, value2, "descripcion");
            return (Criteria) this;
        }

        public Criteria andDescripcionNotBetween(String value1, String value2) {
            addCriterion("Descripcion not between", value1, value2, "descripcion");
            return (Criteria) this;
        }

        public Criteria andURL_videoIsNull() {
            addCriterion("URL_video is null");
            return (Criteria) this;
        }

        public Criteria andURL_videoIsNotNull() {
            addCriterion("URL_video is not null");
            return (Criteria) this;
        }

        public Criteria andURL_videoEqualTo(String value) {
            addCriterion("URL_video =", value, "URL_video");
            return (Criteria) this;
        }

        public Criteria andURL_videoNotEqualTo(String value) {
            addCriterion("URL_video <>", value, "URL_video");
            return (Criteria) this;
        }

        public Criteria andURL_videoGreaterThan(String value) {
            addCriterion("URL_video >", value, "URL_video");
            return (Criteria) this;
        }

        public Criteria andURL_videoGreaterThanOrEqualTo(String value) {
            addCriterion("URL_video >=", value, "URL_video");
            return (Criteria) this;
        }

        public Criteria andURL_videoLessThan(String value) {
            addCriterion("URL_video <", value, "URL_video");
            return (Criteria) this;
        }

        public Criteria andURL_videoLessThanOrEqualTo(String value) {
            addCriterion("URL_video <=", value, "URL_video");
            return (Criteria) this;
        }

        public Criteria andURL_videoLike(String value) {
            addCriterion("URL_video like", value, "URL_video");
            return (Criteria) this;
        }

        public Criteria andURL_videoNotLike(String value) {
            addCriterion("URL_video not like", value, "URL_video");
            return (Criteria) this;
        }

        public Criteria andURL_videoIn(List<String> values) {
            addCriterion("URL_video in", values, "URL_video");
            return (Criteria) this;
        }

        public Criteria andURL_videoNotIn(List<String> values) {
            addCriterion("URL_video not in", values, "URL_video");
            return (Criteria) this;
        }

        public Criteria andURL_videoBetween(String value1, String value2) {
            addCriterion("URL_video between", value1, value2, "URL_video");
            return (Criteria) this;
        }

        public Criteria andURL_videoNotBetween(String value1, String value2) {
            addCriterion("URL_video not between", value1, value2, "URL_video");
            return (Criteria) this;
        }

        public Criteria andId_tipoIsNull() {
            addCriterion("id_tipo is null");
            return (Criteria) this;
        }

        public Criteria andId_tipoIsNotNull() {
            addCriterion("id_tipo is not null");
            return (Criteria) this;
        }

        public Criteria andId_tipoEqualTo(Integer value) {
            addCriterion("id_tipo =", value, "id_tipo");
            return (Criteria) this;
        }

        public Criteria andId_tipoNotEqualTo(Integer value) {
            addCriterion("id_tipo <>", value, "id_tipo");
            return (Criteria) this;
        }

        public Criteria andId_tipoGreaterThan(Integer value) {
            addCriterion("id_tipo >", value, "id_tipo");
            return (Criteria) this;
        }

        public Criteria andId_tipoGreaterThanOrEqualTo(Integer value) {
            addCriterion("id_tipo >=", value, "id_tipo");
            return (Criteria) this;
        }

        public Criteria andId_tipoLessThan(Integer value) {
            addCriterion("id_tipo <", value, "id_tipo");
            return (Criteria) this;
        }

        public Criteria andId_tipoLessThanOrEqualTo(Integer value) {
            addCriterion("id_tipo <=", value, "id_tipo");
            return (Criteria) this;
        }

        public Criteria andId_tipoIn(List<Integer> values) {
            addCriterion("id_tipo in", values, "id_tipo");
            return (Criteria) this;
        }

        public Criteria andId_tipoNotIn(List<Integer> values) {
            addCriterion("id_tipo not in", values, "id_tipo");
            return (Criteria) this;
        }

        public Criteria andId_tipoBetween(Integer value1, Integer value2) {
            addCriterion("id_tipo between", value1, value2, "id_tipo");
            return (Criteria) this;
        }

        public Criteria andId_tipoNotBetween(Integer value1, Integer value2) {
            addCriterion("id_tipo not between", value1, value2, "id_tipo");
            return (Criteria) this;
        }

        public Criteria andId_nivelIsNull() {
            addCriterion("id_nivel is null");
            return (Criteria) this;
        }

        public Criteria andId_nivelIsNotNull() {
            addCriterion("id_nivel is not null");
            return (Criteria) this;
        }

        public Criteria andId_nivelEqualTo(Integer value) {
            addCriterion("id_nivel =", value, "id_nivel");
            return (Criteria) this;
        }

        public Criteria andId_nivelNotEqualTo(Integer value) {
            addCriterion("id_nivel <>", value, "id_nivel");
            return (Criteria) this;
        }

        public Criteria andId_nivelGreaterThan(Integer value) {
            addCriterion("id_nivel >", value, "id_nivel");
            return (Criteria) this;
        }

        public Criteria andId_nivelGreaterThanOrEqualTo(Integer value) {
            addCriterion("id_nivel >=", value, "id_nivel");
            return (Criteria) this;
        }

        public Criteria andId_nivelLessThan(Integer value) {
            addCriterion("id_nivel <", value, "id_nivel");
            return (Criteria) this;
        }

        public Criteria andId_nivelLessThanOrEqualTo(Integer value) {
            addCriterion("id_nivel <=", value, "id_nivel");
            return (Criteria) this;
        }

        public Criteria andId_nivelIn(List<Integer> values) {
            addCriterion("id_nivel in", values, "id_nivel");
            return (Criteria) this;
        }

        public Criteria andId_nivelNotIn(List<Integer> values) {
            addCriterion("id_nivel not in", values, "id_nivel");
            return (Criteria) this;
        }

        public Criteria andId_nivelBetween(Integer value1, Integer value2) {
            addCriterion("id_nivel between", value1, value2, "id_nivel");
            return (Criteria) this;
        }

        public Criteria andId_nivelNotBetween(Integer value1, Integer value2) {
            addCriterion("id_nivel not between", value1, value2, "id_nivel");
            return (Criteria) this;
        }

        public Criteria andEnSeriesIsNull() {
            addCriterion("enSeries is null");
            return (Criteria) this;
        }

        public Criteria andEnSeriesIsNotNull() {
            addCriterion("enSeries is not null");
            return (Criteria) this;
        }

        public Criteria andEnSeriesEqualTo(Integer value) {
            addCriterion("enSeries =", value, "enSeries");
            return (Criteria) this;
        }

        public Criteria andEnSeriesNotEqualTo(Integer value) {
            addCriterion("enSeries <>", value, "enSeries");
            return (Criteria) this;
        }

        public Criteria andEnSeriesGreaterThan(Integer value) {
            addCriterion("enSeries >", value, "enSeries");
            return (Criteria) this;
        }

        public Criteria andEnSeriesGreaterThanOrEqualTo(Integer value) {
            addCriterion("enSeries >=", value, "enSeries");
            return (Criteria) this;
        }

        public Criteria andEnSeriesLessThan(Integer value) {
            addCriterion("enSeries <", value, "enSeries");
            return (Criteria) this;
        }

        public Criteria andEnSeriesLessThanOrEqualTo(Integer value) {
            addCriterion("enSeries <=", value, "enSeries");
            return (Criteria) this;
        }

        public Criteria andEnSeriesIn(List<Integer> values) {
            addCriterion("enSeries in", values, "enSeries");
            return (Criteria) this;
        }

        public Criteria andEnSeriesNotIn(List<Integer> values) {
            addCriterion("enSeries not in", values, "enSeries");
            return (Criteria) this;
        }

        public Criteria andEnSeriesBetween(Integer value1, Integer value2) {
            addCriterion("enSeries between", value1, value2, "enSeries");
            return (Criteria) this;
        }

        public Criteria andEnSeriesNotBetween(Integer value1, Integer value2) {
            addCriterion("enSeries not between", value1, value2, "enSeries");
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