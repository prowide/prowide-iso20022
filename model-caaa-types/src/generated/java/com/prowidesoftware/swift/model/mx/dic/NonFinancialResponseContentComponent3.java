
package com.prowidesoftware.swift.model.mx.dic;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Aim of the non financial response.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NonFinancialResponseContentComponent3", propOrder = {
    "nonFinReqTp",
    "acqrrSelctd",
    "rskMgmtRslt",
    "instlmt",
    "addtlRspn",
    "actn",
    "rspn"
})
public class NonFinancialResponseContentComponent3 {

    @XmlElement(name = "NonFinReqTp", required = true)
    @XmlSchemaType(name = "string")
    protected NonFinancialRequestType2Code nonFinReqTp;
    @XmlElement(name = "AcqrrSelctd")
    protected Acquirer10 acqrrSelctd;
    @XmlElement(name = "RskMgmtRslt")
    @XmlSchemaType(name = "string")
    protected NonFinancialResponseRisk1Code rskMgmtRslt;
    @XmlElement(name = "Instlmt")
    protected List<RecurringTransaction5> instlmt;
    @XmlElement(name = "AddtlRspn")
    protected List<ExternallyDefinedData4> addtlRspn;
    @XmlElement(name = "Actn")
    protected List<Action14> actn;
    @XmlElement(name = "Rspn", required = true)
    protected ResponseType11 rspn;

    /**
     * Gets the value of the nonFinReqTp property.
     * 
     * @return
     *     possible object is
     *     {@link NonFinancialRequestType2Code }
     *     
     */
    public NonFinancialRequestType2Code getNonFinReqTp() {
        return nonFinReqTp;
    }

    /**
     * Sets the value of the nonFinReqTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link NonFinancialRequestType2Code }
     *     
     */
    public NonFinancialResponseContentComponent3 setNonFinReqTp(NonFinancialRequestType2Code value) {
        this.nonFinReqTp = value;
        return this;
    }

    /**
     * Gets the value of the acqrrSelctd property.
     * 
     * @return
     *     possible object is
     *     {@link Acquirer10 }
     *     
     */
    public Acquirer10 getAcqrrSelctd() {
        return acqrrSelctd;
    }

    /**
     * Sets the value of the acqrrSelctd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Acquirer10 }
     *     
     */
    public NonFinancialResponseContentComponent3 setAcqrrSelctd(Acquirer10 value) {
        this.acqrrSelctd = value;
        return this;
    }

    /**
     * Gets the value of the rskMgmtRslt property.
     * 
     * @return
     *     possible object is
     *     {@link NonFinancialResponseRisk1Code }
     *     
     */
    public NonFinancialResponseRisk1Code getRskMgmtRslt() {
        return rskMgmtRslt;
    }

    /**
     * Sets the value of the rskMgmtRslt property.
     * 
     * @param value
     *     allowed object is
     *     {@link NonFinancialResponseRisk1Code }
     *     
     */
    public NonFinancialResponseContentComponent3 setRskMgmtRslt(NonFinancialResponseRisk1Code value) {
        this.rskMgmtRslt = value;
        return this;
    }

    /**
     * Gets the value of the instlmt property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the instlmt property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getInstlmt().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RecurringTransaction5 }
     * 
     * 
     * @return
     *     The value of the instlmt property.
     */
    public List<RecurringTransaction5> getInstlmt() {
        if (instlmt == null) {
            instlmt = new ArrayList<>();
        }
        return this.instlmt;
    }

    /**
     * Gets the value of the addtlRspn property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the addtlRspn property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAddtlRspn().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ExternallyDefinedData4 }
     * 
     * 
     * @return
     *     The value of the addtlRspn property.
     */
    public List<ExternallyDefinedData4> getAddtlRspn() {
        if (addtlRspn == null) {
            addtlRspn = new ArrayList<>();
        }
        return this.addtlRspn;
    }

    /**
     * Gets the value of the actn property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the actn property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getActn().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Action14 }
     * 
     * 
     * @return
     *     The value of the actn property.
     */
    public List<Action14> getActn() {
        if (actn == null) {
            actn = new ArrayList<>();
        }
        return this.actn;
    }

    /**
     * Gets the value of the rspn property.
     * 
     * @return
     *     possible object is
     *     {@link ResponseType11 }
     *     
     */
    public ResponseType11 getRspn() {
        return rspn;
    }

    /**
     * Sets the value of the rspn property.
     * 
     * @param value
     *     allowed object is
     *     {@link ResponseType11 }
     *     
     */
    public NonFinancialResponseContentComponent3 setRspn(ResponseType11 value) {
        this.rspn = value;
        return this;
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
     * Adds a new item to the instlmt list.
     * @see #getInstlmt()
     * 
     */
    public NonFinancialResponseContentComponent3 addInstlmt(RecurringTransaction5 instlmt) {
        getInstlmt().add(instlmt);
        return this;
    }

    /**
     * Adds a new item to the addtlRspn list.
     * @see #getAddtlRspn()
     * 
     */
    public NonFinancialResponseContentComponent3 addAddtlRspn(ExternallyDefinedData4 addtlRspn) {
        getAddtlRspn().add(addtlRspn);
        return this;
    }

    /**
     * Adds a new item to the actn list.
     * @see #getActn()
     * 
     */
    public NonFinancialResponseContentComponent3 addActn(Action14 actn) {
        getActn().add(actn);
        return this;
    }

}
