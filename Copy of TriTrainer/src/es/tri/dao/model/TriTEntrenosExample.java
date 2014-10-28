package es.tri.dao.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class TriTEntrenosExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TriTEntrenosExample() {
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

        protected void addCriterionForJDBCTime(String condition, Date value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Time(value.getTime()), property);
        }

        protected void addCriterionForJDBCTime(String condition, List<Date> values, String property) {
            if (values == null || values.size() == 0) {
                throw new RuntimeException("Value list for " + property + " cannot be null or empty");
            }
            List<java.sql.Time> timeList = new ArrayList<java.sql.Time>();
            Iterator<Date> iter = values.iterator();
            while (iter.hasNext()) {
                timeList.add(new java.sql.Time(iter.next().getTime()));
            }
            addCriterion(condition, timeList, property);
        }

        protected void addCriterionForJDBCTime(String condition, Date value1, Date value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Time(value1.getTime()), new java.sql.Time(value2.getTime()), property);
        }

        public Criteria andId_entreno_ejercicioIsNull() {
            addCriterion("id_entreno_ejercicio is null");
            return (Criteria) this;
        }

        public Criteria andId_entreno_ejercicioIsNotNull() {
            addCriterion("id_entreno_ejercicio is not null");
            return (Criteria) this;
        }

        public Criteria andId_entreno_ejercicioEqualTo(Integer value) {
            addCriterion("id_entreno_ejercicio =", value, "id_entreno_ejercicio");
            return (Criteria) this;
        }

        public Criteria andId_entreno_ejercicioNotEqualTo(Integer value) {
            addCriterion("id_entreno_ejercicio <>", value, "id_entreno_ejercicio");
            return (Criteria) this;
        }

        public Criteria andId_entreno_ejercicioGreaterThan(Integer value) {
            addCriterion("id_entreno_ejercicio >", value, "id_entreno_ejercicio");
            return (Criteria) this;
        }

        public Criteria andId_entreno_ejercicioGreaterThanOrEqualTo(Integer value) {
            addCriterion("id_entreno_ejercicio >=", value, "id_entreno_ejercicio");
            return (Criteria) this;
        }

        public Criteria andId_entreno_ejercicioLessThan(Integer value) {
            addCriterion("id_entreno_ejercicio <", value, "id_entreno_ejercicio");
            return (Criteria) this;
        }

        public Criteria andId_entreno_ejercicioLessThanOrEqualTo(Integer value) {
            addCriterion("id_entreno_ejercicio <=", value, "id_entreno_ejercicio");
            return (Criteria) this;
        }

        public Criteria andId_entreno_ejercicioIn(List<Integer> values) {
            addCriterion("id_entreno_ejercicio in", values, "id_entreno_ejercicio");
            return (Criteria) this;
        }

        public Criteria andId_entreno_ejercicioNotIn(List<Integer> values) {
            addCriterion("id_entreno_ejercicio not in", values, "id_entreno_ejercicio");
            return (Criteria) this;
        }

        public Criteria andId_entreno_ejercicioBetween(Integer value1, Integer value2) {
            addCriterion("id_entreno_ejercicio between", value1, value2, "id_entreno_ejercicio");
            return (Criteria) this;
        }

        public Criteria andId_entreno_ejercicioNotBetween(Integer value1, Integer value2) {
            addCriterion("id_entreno_ejercicio not between", value1, value2, "id_entreno_ejercicio");
            return (Criteria) this;
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
            addCriterion("valoracion is null");
            return (Criteria) this;
        }

        public Criteria andValoracionIsNotNull() {
            addCriterion("valoracion is not null");
            return (Criteria) this;
        }

        public Criteria andValoracionEqualTo(Integer value) {
            addCriterion("valoracion =", value, "valoracion");
            return (Criteria) this;
        }

        public Criteria andValoracionNotEqualTo(Integer value) {
            addCriterion("valoracion <>", value, "valoracion");
            return (Criteria) this;
        }

        public Criteria andValoracionGreaterThan(Integer value) {
            addCriterion("valoracion >", value, "valoracion");
            return (Criteria) this;
        }

        public Criteria andValoracionGreaterThanOrEqualTo(Integer value) {
            addCriterion("valoracion >=", value, "valoracion");
            return (Criteria) this;
        }

        public Criteria andValoracionLessThan(Integer value) {
            addCriterion("valoracion <", value, "valoracion");
            return (Criteria) this;
        }

        public Criteria andValoracionLessThanOrEqualTo(Integer value) {
            addCriterion("valoracion <=", value, "valoracion");
            return (Criteria) this;
        }

        public Criteria andValoracionIn(List<Integer> values) {
            addCriterion("valoracion in", values, "valoracion");
            return (Criteria) this;
        }

        public Criteria andValoracionNotIn(List<Integer> values) {
            addCriterion("valoracion not in", values, "valoracion");
            return (Criteria) this;
        }

        public Criteria andValoracionBetween(Integer value1, Integer value2) {
            addCriterion("valoracion between", value1, value2, "valoracion");
            return (Criteria) this;
        }

        public Criteria andValoracionNotBetween(Integer value1, Integer value2) {
            addCriterion("valoracion not between", value1, value2, "valoracion");
            return (Criteria) this;
        }

        public Criteria andPulsacionesIsNull() {
            addCriterion("pulsaciones is null");
            return (Criteria) this;
        }

        public Criteria andPulsacionesIsNotNull() {
            addCriterion("pulsaciones is not null");
            return (Criteria) this;
        }

        public Criteria andPulsacionesEqualTo(Integer value) {
            addCriterion("pulsaciones =", value, "pulsaciones");
            return (Criteria) this;
        }

        public Criteria andPulsacionesNotEqualTo(Integer value) {
            addCriterion("pulsaciones <>", value, "pulsaciones");
            return (Criteria) this;
        }

        public Criteria andPulsacionesGreaterThan(Integer value) {
            addCriterion("pulsaciones >", value, "pulsaciones");
            return (Criteria) this;
        }

        public Criteria andPulsacionesGreaterThanOrEqualTo(Integer value) {
            addCriterion("pulsaciones >=", value, "pulsaciones");
            return (Criteria) this;
        }

        public Criteria andPulsacionesLessThan(Integer value) {
            addCriterion("pulsaciones <", value, "pulsaciones");
            return (Criteria) this;
        }

        public Criteria andPulsacionesLessThanOrEqualTo(Integer value) {
            addCriterion("pulsaciones <=", value, "pulsaciones");
            return (Criteria) this;
        }

        public Criteria andPulsacionesIn(List<Integer> values) {
            addCriterion("pulsaciones in", values, "pulsaciones");
            return (Criteria) this;
        }

        public Criteria andPulsacionesNotIn(List<Integer> values) {
            addCriterion("pulsaciones not in", values, "pulsaciones");
            return (Criteria) this;
        }

        public Criteria andPulsacionesBetween(Integer value1, Integer value2) {
            addCriterion("pulsaciones between", value1, value2, "pulsaciones");
            return (Criteria) this;
        }

        public Criteria andPulsacionesNotBetween(Integer value1, Integer value2) {
            addCriterion("pulsaciones not between", value1, value2, "pulsaciones");
            return (Criteria) this;
        }

        public Criteria andConseguidoIsNull() {
            addCriterion("conseguido is null");
            return (Criteria) this;
        }

        public Criteria andConseguidoIsNotNull() {
            addCriterion("conseguido is not null");
            return (Criteria) this;
        }

        public Criteria andConseguidoEqualTo(Integer value) {
            addCriterion("conseguido =", value, "conseguido");
            return (Criteria) this;
        }

        public Criteria andConseguidoNotEqualTo(Integer value) {
            addCriterion("conseguido <>", value, "conseguido");
            return (Criteria) this;
        }

        public Criteria andConseguidoGreaterThan(Integer value) {
            addCriterion("conseguido >", value, "conseguido");
            return (Criteria) this;
        }

        public Criteria andConseguidoGreaterThanOrEqualTo(Integer value) {
            addCriterion("conseguido >=", value, "conseguido");
            return (Criteria) this;
        }

        public Criteria andConseguidoLessThan(Integer value) {
            addCriterion("conseguido <", value, "conseguido");
            return (Criteria) this;
        }

        public Criteria andConseguidoLessThanOrEqualTo(Integer value) {
            addCriterion("conseguido <=", value, "conseguido");
            return (Criteria) this;
        }

        public Criteria andConseguidoIn(List<Integer> values) {
            addCriterion("conseguido in", values, "conseguido");
            return (Criteria) this;
        }

        public Criteria andConseguidoNotIn(List<Integer> values) {
            addCriterion("conseguido not in", values, "conseguido");
            return (Criteria) this;
        }

        public Criteria andConseguidoBetween(Integer value1, Integer value2) {
            addCriterion("conseguido between", value1, value2, "conseguido");
            return (Criteria) this;
        }

        public Criteria andConseguidoNotBetween(Integer value1, Integer value2) {
            addCriterion("conseguido not between", value1, value2, "conseguido");
            return (Criteria) this;
        }

        public Criteria andTiempoIsNull() {
            addCriterion("tiempo is null");
            return (Criteria) this;
        }

        public Criteria andTiempoIsNotNull() {
            addCriterion("tiempo is not null");
            return (Criteria) this;
        }

        public Criteria andTiempoEqualTo(Date value) {
            addCriterionForJDBCTime("tiempo =", value, "tiempo");
            return (Criteria) this;
        }

        public Criteria andTiempoNotEqualTo(Date value) {
            addCriterionForJDBCTime("tiempo <>", value, "tiempo");
            return (Criteria) this;
        }

        public Criteria andTiempoGreaterThan(Date value) {
            addCriterionForJDBCTime("tiempo >", value, "tiempo");
            return (Criteria) this;
        }

        public Criteria andTiempoGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCTime("tiempo >=", value, "tiempo");
            return (Criteria) this;
        }

        public Criteria andTiempoLessThan(Date value) {
            addCriterionForJDBCTime("tiempo <", value, "tiempo");
            return (Criteria) this;
        }

        public Criteria andTiempoLessThanOrEqualTo(Date value) {
            addCriterionForJDBCTime("tiempo <=", value, "tiempo");
            return (Criteria) this;
        }

        public Criteria andTiempoIn(List<Date> values) {
            addCriterionForJDBCTime("tiempo in", values, "tiempo");
            return (Criteria) this;
        }

        public Criteria andTiempoNotIn(List<Date> values) {
            addCriterionForJDBCTime("tiempo not in", values, "tiempo");
            return (Criteria) this;
        }

        public Criteria andTiempoBetween(Date value1, Date value2) {
            addCriterionForJDBCTime("tiempo between", value1, value2, "tiempo");
            return (Criteria) this;
        }

        public Criteria andTiempoNotBetween(Date value1, Date value2) {
            addCriterionForJDBCTime("tiempo not between", value1, value2, "tiempo");
            return (Criteria) this;
        }

        public Criteria andIntensidadIsNull() {
            addCriterion("intensidad is null");
            return (Criteria) this;
        }

        public Criteria andIntensidadIsNotNull() {
            addCriterion("intensidad is not null");
            return (Criteria) this;
        }

        public Criteria andIntensidadEqualTo(Integer value) {
            addCriterion("intensidad =", value, "intensidad");
            return (Criteria) this;
        }

        public Criteria andIntensidadNotEqualTo(Integer value) {
            addCriterion("intensidad <>", value, "intensidad");
            return (Criteria) this;
        }

        public Criteria andIntensidadGreaterThan(Integer value) {
            addCriterion("intensidad >", value, "intensidad");
            return (Criteria) this;
        }

        public Criteria andIntensidadGreaterThanOrEqualTo(Integer value) {
            addCriterion("intensidad >=", value, "intensidad");
            return (Criteria) this;
        }

        public Criteria andIntensidadLessThan(Integer value) {
            addCriterion("intensidad <", value, "intensidad");
            return (Criteria) this;
        }

        public Criteria andIntensidadLessThanOrEqualTo(Integer value) {
            addCriterion("intensidad <=", value, "intensidad");
            return (Criteria) this;
        }

        public Criteria andIntensidadIn(List<Integer> values) {
            addCriterion("intensidad in", values, "intensidad");
            return (Criteria) this;
        }

        public Criteria andIntensidadNotIn(List<Integer> values) {
            addCriterion("intensidad not in", values, "intensidad");
            return (Criteria) this;
        }

        public Criteria andIntensidadBetween(Integer value1, Integer value2) {
            addCriterion("intensidad between", value1, value2, "intensidad");
            return (Criteria) this;
        }

        public Criteria andIntensidadNotBetween(Integer value1, Integer value2) {
            addCriterion("intensidad not between", value1, value2, "intensidad");
            return (Criteria) this;
        }

        public Criteria andDistanciaIsNull() {
            addCriterion("distancia is null");
            return (Criteria) this;
        }

        public Criteria andDistanciaIsNotNull() {
            addCriterion("distancia is not null");
            return (Criteria) this;
        }

        public Criteria andDistanciaEqualTo(Integer value) {
            addCriterion("distancia =", value, "distancia");
            return (Criteria) this;
        }

        public Criteria andDistanciaNotEqualTo(Integer value) {
            addCriterion("distancia <>", value, "distancia");
            return (Criteria) this;
        }

        public Criteria andDistanciaGreaterThan(Integer value) {
            addCriterion("distancia >", value, "distancia");
            return (Criteria) this;
        }

        public Criteria andDistanciaGreaterThanOrEqualTo(Integer value) {
            addCriterion("distancia >=", value, "distancia");
            return (Criteria) this;
        }

        public Criteria andDistanciaLessThan(Integer value) {
            addCriterion("distancia <", value, "distancia");
            return (Criteria) this;
        }

        public Criteria andDistanciaLessThanOrEqualTo(Integer value) {
            addCriterion("distancia <=", value, "distancia");
            return (Criteria) this;
        }

        public Criteria andDistanciaIn(List<Integer> values) {
            addCriterion("distancia in", values, "distancia");
            return (Criteria) this;
        }

        public Criteria andDistanciaNotIn(List<Integer> values) {
            addCriterion("distancia not in", values, "distancia");
            return (Criteria) this;
        }

        public Criteria andDistanciaBetween(Integer value1, Integer value2) {
            addCriterion("distancia between", value1, value2, "distancia");
            return (Criteria) this;
        }

        public Criteria andDistanciaNotBetween(Integer value1, Integer value2) {
            addCriterion("distancia not between", value1, value2, "distancia");
            return (Criteria) this;
        }

        public Criteria andSeriesIsNull() {
            addCriterion("series is null");
            return (Criteria) this;
        }

        public Criteria andSeriesIsNotNull() {
            addCriterion("series is not null");
            return (Criteria) this;
        }

        public Criteria andSeriesEqualTo(Integer value) {
            addCriterion("series =", value, "series");
            return (Criteria) this;
        }

        public Criteria andSeriesNotEqualTo(Integer value) {
            addCriterion("series <>", value, "series");
            return (Criteria) this;
        }

        public Criteria andSeriesGreaterThan(Integer value) {
            addCriterion("series >", value, "series");
            return (Criteria) this;
        }

        public Criteria andSeriesGreaterThanOrEqualTo(Integer value) {
            addCriterion("series >=", value, "series");
            return (Criteria) this;
        }

        public Criteria andSeriesLessThan(Integer value) {
            addCriterion("series <", value, "series");
            return (Criteria) this;
        }

        public Criteria andSeriesLessThanOrEqualTo(Integer value) {
            addCriterion("series <=", value, "series");
            return (Criteria) this;
        }

        public Criteria andSeriesIn(List<Integer> values) {
            addCriterion("series in", values, "series");
            return (Criteria) this;
        }

        public Criteria andSeriesNotIn(List<Integer> values) {
            addCriterion("series not in", values, "series");
            return (Criteria) this;
        }

        public Criteria andSeriesBetween(Integer value1, Integer value2) {
            addCriterion("series between", value1, value2, "series");
            return (Criteria) this;
        }

        public Criteria andSeriesNotBetween(Integer value1, Integer value2) {
            addCriterion("series not between", value1, value2, "series");
            return (Criteria) this;
        }

        public Criteria andRepeticionesIsNull() {
            addCriterion("repeticiones is null");
            return (Criteria) this;
        }

        public Criteria andRepeticionesIsNotNull() {
            addCriterion("repeticiones is not null");
            return (Criteria) this;
        }

        public Criteria andRepeticionesEqualTo(Integer value) {
            addCriterion("repeticiones =", value, "repeticiones");
            return (Criteria) this;
        }

        public Criteria andRepeticionesNotEqualTo(Integer value) {
            addCriterion("repeticiones <>", value, "repeticiones");
            return (Criteria) this;
        }

        public Criteria andRepeticionesGreaterThan(Integer value) {
            addCriterion("repeticiones >", value, "repeticiones");
            return (Criteria) this;
        }

        public Criteria andRepeticionesGreaterThanOrEqualTo(Integer value) {
            addCriterion("repeticiones >=", value, "repeticiones");
            return (Criteria) this;
        }

        public Criteria andRepeticionesLessThan(Integer value) {
            addCriterion("repeticiones <", value, "repeticiones");
            return (Criteria) this;
        }

        public Criteria andRepeticionesLessThanOrEqualTo(Integer value) {
            addCriterion("repeticiones <=", value, "repeticiones");
            return (Criteria) this;
        }

        public Criteria andRepeticionesIn(List<Integer> values) {
            addCriterion("repeticiones in", values, "repeticiones");
            return (Criteria) this;
        }

        public Criteria andRepeticionesNotIn(List<Integer> values) {
            addCriterion("repeticiones not in", values, "repeticiones");
            return (Criteria) this;
        }

        public Criteria andRepeticionesBetween(Integer value1, Integer value2) {
            addCriterion("repeticiones between", value1, value2, "repeticiones");
            return (Criteria) this;
        }

        public Criteria andRepeticionesNotBetween(Integer value1, Integer value2) {
            addCriterion("repeticiones not between", value1, value2, "repeticiones");
            return (Criteria) this;
        }

        public Criteria andDescansoIsNull() {
            addCriterion("descanso is null");
            return (Criteria) this;
        }

        public Criteria andDescansoIsNotNull() {
            addCriterion("descanso is not null");
            return (Criteria) this;
        }

        public Criteria andDescansoEqualTo(Integer value) {
            addCriterion("descanso =", value, "descanso");
            return (Criteria) this;
        }

        public Criteria andDescansoNotEqualTo(Integer value) {
            addCriterion("descanso <>", value, "descanso");
            return (Criteria) this;
        }

        public Criteria andDescansoGreaterThan(Integer value) {
            addCriterion("descanso >", value, "descanso");
            return (Criteria) this;
        }

        public Criteria andDescansoGreaterThanOrEqualTo(Integer value) {
            addCriterion("descanso >=", value, "descanso");
            return (Criteria) this;
        }

        public Criteria andDescansoLessThan(Integer value) {
            addCriterion("descanso <", value, "descanso");
            return (Criteria) this;
        }

        public Criteria andDescansoLessThanOrEqualTo(Integer value) {
            addCriterion("descanso <=", value, "descanso");
            return (Criteria) this;
        }

        public Criteria andDescansoIn(List<Integer> values) {
            addCriterion("descanso in", values, "descanso");
            return (Criteria) this;
        }

        public Criteria andDescansoNotIn(List<Integer> values) {
            addCriterion("descanso not in", values, "descanso");
            return (Criteria) this;
        }

        public Criteria andDescansoBetween(Integer value1, Integer value2) {
            addCriterion("descanso between", value1, value2, "descanso");
            return (Criteria) this;
        }

        public Criteria andDescansoNotBetween(Integer value1, Integer value2) {
            addCriterion("descanso not between", value1, value2, "descanso");
            return (Criteria) this;
        }

        public Criteria andFechaIsNull() {
            addCriterion("fecha is null");
            return (Criteria) this;
        }

        public Criteria andFechaIsNotNull() {
            addCriterion("fecha is not null");
            return (Criteria) this;
        }

        public Criteria andFechaEqualTo(Date value) {
            addCriterionForJDBCDate("fecha =", value, "fecha");
            return (Criteria) this;
        }

        public Criteria andFechaNotEqualTo(Date value) {
            addCriterionForJDBCDate("fecha <>", value, "fecha");
            return (Criteria) this;
        }

        public Criteria andFechaGreaterThan(Date value) {
            addCriterionForJDBCDate("fecha >", value, "fecha");
            return (Criteria) this;
        }

        public Criteria andFechaGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("fecha >=", value, "fecha");
            return (Criteria) this;
        }

        public Criteria andFechaLessThan(Date value) {
            addCriterionForJDBCDate("fecha <", value, "fecha");
            return (Criteria) this;
        }

        public Criteria andFechaLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("fecha <=", value, "fecha");
            return (Criteria) this;
        }

        public Criteria andFechaIn(List<Date> values) {
            addCriterionForJDBCDate("fecha in", values, "fecha");
            return (Criteria) this;
        }

        public Criteria andFechaNotIn(List<Date> values) {
            addCriterionForJDBCDate("fecha not in", values, "fecha");
            return (Criteria) this;
        }

        public Criteria andFechaBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("fecha between", value1, value2, "fecha");
            return (Criteria) this;
        }

        public Criteria andFechaNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("fecha not between", value1, value2, "fecha");
            return (Criteria) this;
        }

        public Criteria andDiaSemanaIsNull() {
            addCriterion("DiaSemana is null");
            return (Criteria) this;
        }

        public Criteria andDiaSemanaIsNotNull() {
            addCriterion("DiaSemana is not null");
            return (Criteria) this;
        }

        public Criteria andDiaSemanaEqualTo(Integer value) {
            addCriterion("DiaSemana =", value, "diaSemana");
            return (Criteria) this;
        }

        public Criteria andDiaSemanaNotEqualTo(Integer value) {
            addCriterion("DiaSemana <>", value, "diaSemana");
            return (Criteria) this;
        }

        public Criteria andDiaSemanaGreaterThan(Integer value) {
            addCriterion("DiaSemana >", value, "diaSemana");
            return (Criteria) this;
        }

        public Criteria andDiaSemanaGreaterThanOrEqualTo(Integer value) {
            addCriterion("DiaSemana >=", value, "diaSemana");
            return (Criteria) this;
        }

        public Criteria andDiaSemanaLessThan(Integer value) {
            addCriterion("DiaSemana <", value, "diaSemana");
            return (Criteria) this;
        }

        public Criteria andDiaSemanaLessThanOrEqualTo(Integer value) {
            addCriterion("DiaSemana <=", value, "diaSemana");
            return (Criteria) this;
        }

        public Criteria andDiaSemanaIn(List<Integer> values) {
            addCriterion("DiaSemana in", values, "diaSemana");
            return (Criteria) this;
        }

        public Criteria andDiaSemanaNotIn(List<Integer> values) {
            addCriterion("DiaSemana not in", values, "diaSemana");
            return (Criteria) this;
        }

        public Criteria andDiaSemanaBetween(Integer value1, Integer value2) {
            addCriterion("DiaSemana between", value1, value2, "diaSemana");
            return (Criteria) this;
        }

        public Criteria andDiaSemanaNotBetween(Integer value1, Integer value2) {
            addCriterion("DiaSemana not between", value1, value2, "diaSemana");
            return (Criteria) this;
        }

        public Criteria andSemanaIsNull() {
            addCriterion("Semana is null");
            return (Criteria) this;
        }

        public Criteria andSemanaIsNotNull() {
            addCriterion("Semana is not null");
            return (Criteria) this;
        }

        public Criteria andSemanaEqualTo(Integer value) {
            addCriterion("Semana =", value, "semana");
            return (Criteria) this;
        }

        public Criteria andSemanaNotEqualTo(Integer value) {
            addCriterion("Semana <>", value, "semana");
            return (Criteria) this;
        }

        public Criteria andSemanaGreaterThan(Integer value) {
            addCriterion("Semana >", value, "semana");
            return (Criteria) this;
        }

        public Criteria andSemanaGreaterThanOrEqualTo(Integer value) {
            addCriterion("Semana >=", value, "semana");
            return (Criteria) this;
        }

        public Criteria andSemanaLessThan(Integer value) {
            addCriterion("Semana <", value, "semana");
            return (Criteria) this;
        }

        public Criteria andSemanaLessThanOrEqualTo(Integer value) {
            addCriterion("Semana <=", value, "semana");
            return (Criteria) this;
        }

        public Criteria andSemanaIn(List<Integer> values) {
            addCriterion("Semana in", values, "semana");
            return (Criteria) this;
        }

        public Criteria andSemanaNotIn(List<Integer> values) {
            addCriterion("Semana not in", values, "semana");
            return (Criteria) this;
        }

        public Criteria andSemanaBetween(Integer value1, Integer value2) {
            addCriterion("Semana between", value1, value2, "semana");
            return (Criteria) this;
        }

        public Criteria andSemanaNotBetween(Integer value1, Integer value2) {
            addCriterion("Semana not between", value1, value2, "semana");
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