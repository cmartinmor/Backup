package es.tri.dao.model;

import java.util.ArrayList;
import java.util.List;

public class TriTBioUsuarioExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TriTBioUsuarioExample() {
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

        public Criteria andEdadIsNull() {
            addCriterion("edad is null");
            return (Criteria) this;
        }

        public Criteria andEdadIsNotNull() {
            addCriterion("edad is not null");
            return (Criteria) this;
        }

        public Criteria andEdadEqualTo(Integer value) {
            addCriterion("edad =", value, "edad");
            return (Criteria) this;
        }

        public Criteria andEdadNotEqualTo(Integer value) {
            addCriterion("edad <>", value, "edad");
            return (Criteria) this;
        }

        public Criteria andEdadGreaterThan(Integer value) {
            addCriterion("edad >", value, "edad");
            return (Criteria) this;
        }

        public Criteria andEdadGreaterThanOrEqualTo(Integer value) {
            addCriterion("edad >=", value, "edad");
            return (Criteria) this;
        }

        public Criteria andEdadLessThan(Integer value) {
            addCriterion("edad <", value, "edad");
            return (Criteria) this;
        }

        public Criteria andEdadLessThanOrEqualTo(Integer value) {
            addCriterion("edad <=", value, "edad");
            return (Criteria) this;
        }

        public Criteria andEdadIn(List<Integer> values) {
            addCriterion("edad in", values, "edad");
            return (Criteria) this;
        }

        public Criteria andEdadNotIn(List<Integer> values) {
            addCriterion("edad not in", values, "edad");
            return (Criteria) this;
        }

        public Criteria andEdadBetween(Integer value1, Integer value2) {
            addCriterion("edad between", value1, value2, "edad");
            return (Criteria) this;
        }

        public Criteria andEdadNotBetween(Integer value1, Integer value2) {
            addCriterion("edad not between", value1, value2, "edad");
            return (Criteria) this;
        }

        public Criteria andPesoIsNull() {
            addCriterion("peso is null");
            return (Criteria) this;
        }

        public Criteria andPesoIsNotNull() {
            addCriterion("peso is not null");
            return (Criteria) this;
        }

        public Criteria andPesoEqualTo(Integer value) {
            addCriterion("peso =", value, "peso");
            return (Criteria) this;
        }

        public Criteria andPesoNotEqualTo(Integer value) {
            addCriterion("peso <>", value, "peso");
            return (Criteria) this;
        }

        public Criteria andPesoGreaterThan(Integer value) {
            addCriterion("peso >", value, "peso");
            return (Criteria) this;
        }

        public Criteria andPesoGreaterThanOrEqualTo(Integer value) {
            addCriterion("peso >=", value, "peso");
            return (Criteria) this;
        }

        public Criteria andPesoLessThan(Integer value) {
            addCriterion("peso <", value, "peso");
            return (Criteria) this;
        }

        public Criteria andPesoLessThanOrEqualTo(Integer value) {
            addCriterion("peso <=", value, "peso");
            return (Criteria) this;
        }

        public Criteria andPesoIn(List<Integer> values) {
            addCriterion("peso in", values, "peso");
            return (Criteria) this;
        }

        public Criteria andPesoNotIn(List<Integer> values) {
            addCriterion("peso not in", values, "peso");
            return (Criteria) this;
        }

        public Criteria andPesoBetween(Integer value1, Integer value2) {
            addCriterion("peso between", value1, value2, "peso");
            return (Criteria) this;
        }

        public Criteria andPesoNotBetween(Integer value1, Integer value2) {
            addCriterion("peso not between", value1, value2, "peso");
            return (Criteria) this;
        }

        public Criteria andPulsaciones_reposoIsNull() {
            addCriterion("Pulsaciones_reposo is null");
            return (Criteria) this;
        }

        public Criteria andPulsaciones_reposoIsNotNull() {
            addCriterion("Pulsaciones_reposo is not null");
            return (Criteria) this;
        }

        public Criteria andPulsaciones_reposoEqualTo(Integer value) {
            addCriterion("Pulsaciones_reposo =", value, "pulsaciones_reposo");
            return (Criteria) this;
        }

        public Criteria andPulsaciones_reposoNotEqualTo(Integer value) {
            addCriterion("Pulsaciones_reposo <>", value, "pulsaciones_reposo");
            return (Criteria) this;
        }

        public Criteria andPulsaciones_reposoGreaterThan(Integer value) {
            addCriterion("Pulsaciones_reposo >", value, "pulsaciones_reposo");
            return (Criteria) this;
        }

        public Criteria andPulsaciones_reposoGreaterThanOrEqualTo(Integer value) {
            addCriterion("Pulsaciones_reposo >=", value, "pulsaciones_reposo");
            return (Criteria) this;
        }

        public Criteria andPulsaciones_reposoLessThan(Integer value) {
            addCriterion("Pulsaciones_reposo <", value, "pulsaciones_reposo");
            return (Criteria) this;
        }

        public Criteria andPulsaciones_reposoLessThanOrEqualTo(Integer value) {
            addCriterion("Pulsaciones_reposo <=", value, "pulsaciones_reposo");
            return (Criteria) this;
        }

        public Criteria andPulsaciones_reposoIn(List<Integer> values) {
            addCriterion("Pulsaciones_reposo in", values, "pulsaciones_reposo");
            return (Criteria) this;
        }

        public Criteria andPulsaciones_reposoNotIn(List<Integer> values) {
            addCriterion("Pulsaciones_reposo not in", values, "pulsaciones_reposo");
            return (Criteria) this;
        }

        public Criteria andPulsaciones_reposoBetween(Integer value1, Integer value2) {
            addCriterion("Pulsaciones_reposo between", value1, value2, "pulsaciones_reposo");
            return (Criteria) this;
        }

        public Criteria andPulsaciones_reposoNotBetween(Integer value1, Integer value2) {
            addCriterion("Pulsaciones_reposo not between", value1, value2, "pulsaciones_reposo");
            return (Criteria) this;
        }

        public Criteria andPulsaciones_maximasIsNull() {
            addCriterion("Pulsaciones_maximas is null");
            return (Criteria) this;
        }

        public Criteria andPulsaciones_maximasIsNotNull() {
            addCriterion("Pulsaciones_maximas is not null");
            return (Criteria) this;
        }

        public Criteria andPulsaciones_maximasEqualTo(Integer value) {
            addCriterion("Pulsaciones_maximas =", value, "pulsaciones_maximas");
            return (Criteria) this;
        }

        public Criteria andPulsaciones_maximasNotEqualTo(Integer value) {
            addCriterion("Pulsaciones_maximas <>", value, "pulsaciones_maximas");
            return (Criteria) this;
        }

        public Criteria andPulsaciones_maximasGreaterThan(Integer value) {
            addCriterion("Pulsaciones_maximas >", value, "pulsaciones_maximas");
            return (Criteria) this;
        }

        public Criteria andPulsaciones_maximasGreaterThanOrEqualTo(Integer value) {
            addCriterion("Pulsaciones_maximas >=", value, "pulsaciones_maximas");
            return (Criteria) this;
        }

        public Criteria andPulsaciones_maximasLessThan(Integer value) {
            addCriterion("Pulsaciones_maximas <", value, "pulsaciones_maximas");
            return (Criteria) this;
        }

        public Criteria andPulsaciones_maximasLessThanOrEqualTo(Integer value) {
            addCriterion("Pulsaciones_maximas <=", value, "pulsaciones_maximas");
            return (Criteria) this;
        }

        public Criteria andPulsaciones_maximasIn(List<Integer> values) {
            addCriterion("Pulsaciones_maximas in", values, "pulsaciones_maximas");
            return (Criteria) this;
        }

        public Criteria andPulsaciones_maximasNotIn(List<Integer> values) {
            addCriterion("Pulsaciones_maximas not in", values, "pulsaciones_maximas");
            return (Criteria) this;
        }

        public Criteria andPulsaciones_maximasBetween(Integer value1, Integer value2) {
            addCriterion("Pulsaciones_maximas between", value1, value2, "pulsaciones_maximas");
            return (Criteria) this;
        }

        public Criteria andPulsaciones_maximasNotBetween(Integer value1, Integer value2) {
            addCriterion("Pulsaciones_maximas not between", value1, value2, "pulsaciones_maximas");
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