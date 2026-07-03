
package com.prowidesoftware.swift.model.mx.dic;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
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
@XmlType(name = "ForecastParameter2", propOrder = {
    "rptParam",
    "cshInFcstDtls",
    "cshOutFcstDtls",
    "netCshFcstDtls"
})
public class ForecastParameter2 {

    @XmlElement(name = "RptParam", required = true)
    protected ReportParameter2Choice rptParam;
    @XmlElement(name = "CshInFcstDtls")
    protected List<CashInForecast1> cshInFcstDtls;
    @XmlElement(name = "CshOutFcstDtls")
    protected List<CashOutForecast1> cshOutFcstDtls;
    @XmlElement(name = "NetCshFcstDtls")
    protected List<NetCashForecast1> netCshFcstDtls;

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
    public ForecastParameter2 setRptParam(ReportParameter2Choice value) {
        this.rptParam = value;
        return this;
    }

    /**
     * Gets the value of the cshInFcstDtls property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the cshInFcstDtls property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCshInFcstDtls().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CashInForecast1 }
     * 
     * 
     */
    public List<CashInForecast1> getCshInFcstDtls() {
        if (cshInFcstDtls == null) {
            cshInFcstDtls = new ArrayList<CashInForecast1>();
        }
        return this.cshInFcstDtls;
    }

    /**
     * Gets the value of the cshOutFcstDtls property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the cshOutFcstDtls property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCshOutFcstDtls().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CashOutForecast1 }
     * 
     * 
     */
    public List<CashOutForecast1> getCshOutFcstDtls() {
        if (cshOutFcstDtls == null) {
            cshOutFcstDtls = new ArrayList<CashOutForecast1>();
        }
        return this.cshOutFcstDtls;
    }

    /**
     * Gets the value of the netCshFcstDtls property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the netCshFcstDtls property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNetCshFcstDtls().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link NetCashForecast1 }
     * 
     * 
     */
    public List<NetCashForecast1> getNetCshFcstDtls() {
        if (netCshFcstDtls == null) {
            netCshFcstDtls = new ArrayList<NetCashForecast1>();
        }
        return this.netCshFcstDtls;
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
     * Adds a new item to the cshInFcstDtls list.
     * @see #getCshInFcstDtls()
     * 
     */
    public ForecastParameter2 addCshInFcstDtls(CashInForecast1 cshInFcstDtls) {
        getCshInFcstDtls().add(cshInFcstDtls);
        return this;
    }

    /**
     * Adds a new item to the cshOutFcstDtls list.
     * @see #getCshOutFcstDtls()
     * 
     */
    public ForecastParameter2 addCshOutFcstDtls(CashOutForecast1 cshOutFcstDtls) {
        getCshOutFcstDtls().add(cshOutFcstDtls);
        return this;
    }

    /**
     * Adds a new item to the netCshFcstDtls list.
     * @see #getNetCshFcstDtls()
     * 
     */
    public ForecastParameter2 addNetCshFcstDtls(NetCashForecast1 netCshFcstDtls) {
        getNetCshFcstDtls().add(netCshFcstDtls);
        return this;
    }

}
