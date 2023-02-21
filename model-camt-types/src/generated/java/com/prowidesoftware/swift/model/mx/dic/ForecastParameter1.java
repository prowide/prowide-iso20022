
package com.prowidesoftware.swift.model.mx.dic;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Parameters used to report cash movements,eg, country code, currency code, BIC or a user defined parameter.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ForecastParameter1", propOrder = {
    "rptParam",
    "estmtdCshInFcstDtls",
    "estmtdCshOutFcstDtls",
    "estmtdNetCshFcstDtls"
})
public class ForecastParameter1 {

    @XmlElement(name = "RptParam", required = true)
    protected ReportParameter2Choice rptParam;
    @XmlElement(name = "EstmtdCshInFcstDtls")
    protected List<CashInForecast1> estmtdCshInFcstDtls;
    @XmlElement(name = "EstmtdCshOutFcstDtls")
    protected List<CashOutForecast1> estmtdCshOutFcstDtls;
    @XmlElement(name = "EstmtdNetCshFcstDtls")
    protected List<NetCashForecast1> estmtdNetCshFcstDtls;

    /**
     * Gets the value of the rptParam property.
     * 
     * @return
     *     possible object is
     *     {@link ReportParameter2Choice }
     *     
     */
    public ReportParameter2Choice getRptParam() {
        return rptParam;
    }

    /**
     * Sets the value of the rptParam property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReportParameter2Choice }
     *     
     */
    public ForecastParameter1 setRptParam(ReportParameter2Choice value) {
        this.rptParam = value;
        return this;
    }

    /**
     * Gets the value of the estmtdCshInFcstDtls property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the estmtdCshInFcstDtls property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEstmtdCshInFcstDtls().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CashInForecast1 }
     * 
     * 
     */
    public List<CashInForecast1> getEstmtdCshInFcstDtls() {
        if (estmtdCshInFcstDtls == null) {
            estmtdCshInFcstDtls = new ArrayList<CashInForecast1>();
        }
        return this.estmtdCshInFcstDtls;
    }

    /**
     * Gets the value of the estmtdCshOutFcstDtls property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the estmtdCshOutFcstDtls property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEstmtdCshOutFcstDtls().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CashOutForecast1 }
     * 
     * 
     */
    public List<CashOutForecast1> getEstmtdCshOutFcstDtls() {
        if (estmtdCshOutFcstDtls == null) {
            estmtdCshOutFcstDtls = new ArrayList<CashOutForecast1>();
        }
        return this.estmtdCshOutFcstDtls;
    }

    /**
     * Gets the value of the estmtdNetCshFcstDtls property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the estmtdNetCshFcstDtls property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEstmtdNetCshFcstDtls().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link NetCashForecast1 }
     * 
     * 
     */
    public List<NetCashForecast1> getEstmtdNetCshFcstDtls() {
        if (estmtdNetCshFcstDtls == null) {
            estmtdNetCshFcstDtls = new ArrayList<NetCashForecast1>();
        }
        return this.estmtdNetCshFcstDtls;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this, ToStringStyle.MULTI_LINE_STYLE);
    }

    @Override
    public boolean equals(Object that) {
        return EqualsBuilder.reflectionEquals(this, that);
    }

    @Override
    public int hashCode() {
        return HashCodeBuilder.reflectionHashCode(this);
    }

    /**
     * Adds a new item to the estmtdCshInFcstDtls list.
     * @see #getEstmtdCshInFcstDtls()
     * 
     */
    public ForecastParameter1 addEstmtdCshInFcstDtls(CashInForecast1 estmtdCshInFcstDtls) {
        getEstmtdCshInFcstDtls().add(estmtdCshInFcstDtls);
        return this;
    }

    /**
     * Adds a new item to the estmtdCshOutFcstDtls list.
     * @see #getEstmtdCshOutFcstDtls()
     * 
     */
    public ForecastParameter1 addEstmtdCshOutFcstDtls(CashOutForecast1 estmtdCshOutFcstDtls) {
        getEstmtdCshOutFcstDtls().add(estmtdCshOutFcstDtls);
        return this;
    }

    /**
     * Adds a new item to the estmtdNetCshFcstDtls list.
     * @see #getEstmtdNetCshFcstDtls()
     * 
     */
    public ForecastParameter1 addEstmtdNetCshFcstDtls(NetCashForecast1 estmtdNetCshFcstDtls) {
        getEstmtdNetCshFcstDtls().add(estmtdNetCshFcstDtls);
        return this;
    }

}
