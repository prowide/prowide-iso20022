
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
 * Specifies the cash-in and cash-out flows by party.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BreakdownByParty1", propOrder = {
    "pty",
    "addtlParams",
    "cshInFcst",
    "cshOutFcst",
    "netCshFcst"
})
public class BreakdownByParty1 {

    @XmlElement(name = "Pty", required = true)
    protected PartyIdentification2Choice pty;
    @XmlElement(name = "AddtlParams")
    protected AdditionalParameters1 addtlParams;
    @XmlElement(name = "CshInFcst")
    protected List<CashInForecast3> cshInFcst;
    @XmlElement(name = "CshOutFcst")
    protected List<CashOutForecast3> cshOutFcst;
    @XmlElement(name = "NetCshFcst")
    protected List<NetCashForecast2> netCshFcst;

    /**
     * Gets the value of the pty property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification2Choice }
     *     
     */
    public PartyIdentification2Choice getPty() {
        return pty;
    }

    /**
     * Sets the value of the pty property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification2Choice }
     *     
     */
    public BreakdownByParty1 setPty(PartyIdentification2Choice value) {
        this.pty = value;
        return this;
    }

    /**
     * Gets the value of the addtlParams property.
     * 
     * @return
     *     possible object is
     *     {@link AdditionalParameters1 }
     *     
     */
    public AdditionalParameters1 getAddtlParams() {
        return addtlParams;
    }

    /**
     * Sets the value of the addtlParams property.
     * 
     * @param value
     *     allowed object is
     *     {@link AdditionalParameters1 }
     *     
     */
    public BreakdownByParty1 setAddtlParams(AdditionalParameters1 value) {
        this.addtlParams = value;
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
     * {@link CashInForecast3 }
     * 
     * 
     */
    public List<CashInForecast3> getCshInFcst() {
        if (cshInFcst == null) {
            cshInFcst = new ArrayList<CashInForecast3>();
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
     * {@link CashOutForecast3 }
     * 
     * 
     */
    public List<CashOutForecast3> getCshOutFcst() {
        if (cshOutFcst == null) {
            cshOutFcst = new ArrayList<CashOutForecast3>();
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
     * {@link NetCashForecast2 }
     * 
     * 
     */
    public List<NetCashForecast2> getNetCshFcst() {
        if (netCshFcst == null) {
            netCshFcst = new ArrayList<NetCashForecast2>();
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
    public BreakdownByParty1 addCshInFcst(CashInForecast3 cshInFcst) {
        getCshInFcst().add(cshInFcst);
        return this;
    }

    /**
     * Adds a new item to the cshOutFcst list.
     * @see #getCshOutFcst()
     * 
     */
    public BreakdownByParty1 addCshOutFcst(CashOutForecast3 cshOutFcst) {
        getCshOutFcst().add(cshOutFcst);
        return this;
    }

    /**
     * Adds a new item to the netCshFcst list.
     * @see #getNetCshFcst()
     * 
     */
    public BreakdownByParty1 addNetCshFcst(NetCashForecast2 netCshFcst) {
        getNetCshFcst().add(netCshFcst);
        return this;
    }

}
