
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
 * Specifies the cash-in and cash-out flows by a user defined parameter/s.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BreakdownByUserDefinedParameter3", propOrder = {
    "pty",
    "ctry",
    "ccy",
    "usrDfnd",
    "cshInFcst",
    "cshOutFcst",
    "netCshFcst"
})
public class BreakdownByUserDefinedParameter3 {

    @XmlElement(name = "Pty")
    protected InvestmentAccount42 pty;
    @XmlElement(name = "Ctry")
    protected String ctry;
    @XmlElement(name = "Ccy")
    protected String ccy;
    @XmlElement(name = "UsrDfnd")
    protected DataFormat2Choice usrDfnd;
    @XmlElement(name = "CshInFcst")
    protected List<CashInForecast5> cshInFcst;
    @XmlElement(name = "CshOutFcst")
    protected List<CashOutForecast5> cshOutFcst;
    @XmlElement(name = "NetCshFcst")
    protected List<NetCashForecast4> netCshFcst;

    /**
     * Gets the value of the pty property.
     * 
     * @return
     *     possible object is
     *     {@link InvestmentAccount42 }
     *     
     */
    public InvestmentAccount42 getPty() {
        return pty;
    }

    /**
     * Sets the value of the pty property.
     * 
     * @param value
     *     allowed object is
     *     {@link InvestmentAccount42 }
     *     
     */
    public BreakdownByUserDefinedParameter3 setPty(InvestmentAccount42 value) {
        this.pty = value;
        return this;
    }

    /**
     * Gets the value of the ctry property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCtry() {
        return ctry;
    }

    /**
     * Sets the value of the ctry property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public BreakdownByUserDefinedParameter3 setCtry(String value) {
        this.ctry = value;
        return this;
    }

    /**
     * Gets the value of the ccy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCcy() {
        return ccy;
    }

    /**
     * Sets the value of the ccy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public BreakdownByUserDefinedParameter3 setCcy(String value) {
        this.ccy = value;
        return this;
    }

    /**
     * Gets the value of the usrDfnd property.
     * 
     * @return
     *     possible object is
     *     {@link DataFormat2Choice }
     *     
     */
    public DataFormat2Choice getUsrDfnd() {
        return usrDfnd;
    }

    /**
     * Sets the value of the usrDfnd property.
     * 
     * @param value
     *     allowed object is
     *     {@link DataFormat2Choice }
     *     
     */
    public BreakdownByUserDefinedParameter3 setUsrDfnd(DataFormat2Choice value) {
        this.usrDfnd = value;
        return this;
    }

    /**
     * Gets the value of the cshInFcst property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the cshInFcst property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCshInFcst().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CashInForecast5 }
     * 
     * 
     */
    public List<CashInForecast5> getCshInFcst() {
        if (cshInFcst == null) {
            cshInFcst = new ArrayList<CashInForecast5>();
        }
        return this.cshInFcst;
    }

    /**
     * Gets the value of the cshOutFcst property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the cshOutFcst property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCshOutFcst().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CashOutForecast5 }
     * 
     * 
     */
    public List<CashOutForecast5> getCshOutFcst() {
        if (cshOutFcst == null) {
            cshOutFcst = new ArrayList<CashOutForecast5>();
        }
        return this.cshOutFcst;
    }

    /**
     * Gets the value of the netCshFcst property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the netCshFcst property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNetCshFcst().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link NetCashForecast4 }
     * 
     * 
     */
    public List<NetCashForecast4> getNetCshFcst() {
        if (netCshFcst == null) {
            netCshFcst = new ArrayList<NetCashForecast4>();
        }
        return this.netCshFcst;
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
     * Adds a new item to the cshInFcst list.
     * @see #getCshInFcst()
     * 
     */
    public BreakdownByUserDefinedParameter3 addCshInFcst(CashInForecast5 cshInFcst) {
        getCshInFcst().add(cshInFcst);
        return this;
    }

    /**
     * Adds a new item to the cshOutFcst list.
     * @see #getCshOutFcst()
     * 
     */
    public BreakdownByUserDefinedParameter3 addCshOutFcst(CashOutForecast5 cshOutFcst) {
        getCshOutFcst().add(cshOutFcst);
        return this;
    }

    /**
     * Adds a new item to the netCshFcst list.
     * @see #getNetCshFcst()
     * 
     */
    public BreakdownByUserDefinedParameter3 addNetCshFcst(NetCashForecast4 netCshFcst) {
        getNetCshFcst().add(netCshFcst);
        return this;
    }

}
