
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.datatype.XMLGregorianCalendar;
import com.prowidesoftware.swift.model.mx.adapters.IsoDateTimeAdapter;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Set of characteristics shared by all individual charges records included in the message.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GroupHeader126", propOrder = {
    "msgId",
    "creDtTm",
    "chrgsRqstr",
    "ttlChrgs",
    "chrgsAcct",
    "chrgsAcctOwnr"
})
public class GroupHeader126 {

    @XmlElement(name = "MsgId", required = true)
    protected String msgId;
    @XmlElement(name = "CreDtTm", required = true, type = String.class)
    @XmlJavaTypeAdapter(IsoDateTimeAdapter.class)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar creDtTm;
    @XmlElement(name = "ChrgsRqstr")
    protected BranchAndFinancialInstitutionIdentification8 chrgsRqstr;
    @XmlElement(name = "TtlChrgs")
    protected TotalCharges7 ttlChrgs;
    @XmlElement(name = "ChrgsAcct")
    protected CashAccount40 chrgsAcct;
    @XmlElement(name = "ChrgsAcctOwnr")
    protected BranchAndFinancialInstitutionIdentification8 chrgsAcctOwnr;

    /**
     * Gets the value of the msgId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMsgId() {
        return msgId;
    }

    /**
     * Sets the value of the msgId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public GroupHeader126 setMsgId(String value) {
        this.msgId = value;
        return this;
    }

    /**
     * Gets the value of the creDtTm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public XMLGregorianCalendar getCreDtTm() {
        return creDtTm;
    }

    /**
     * Sets the value of the creDtTm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public GroupHeader126 setCreDtTm(XMLGregorianCalendar value) {
        this.creDtTm = value;
        return this;
    }

    /**
     * Gets the value of the chrgsRqstr property.
     * 
     * @return
     *     possible object is
     *     {@link BranchAndFinancialInstitutionIdentification8 }
     *     
     */
    public BranchAndFinancialInstitutionIdentification8 getChrgsRqstr() {
        return chrgsRqstr;
    }

    /**
     * Sets the value of the chrgsRqstr property.
     * 
     * @param value
     *     allowed object is
     *     {@link BranchAndFinancialInstitutionIdentification8 }
     *     
     */
    public GroupHeader126 setChrgsRqstr(BranchAndFinancialInstitutionIdentification8 value) {
        this.chrgsRqstr = value;
        return this;
    }

    /**
     * Gets the value of the ttlChrgs property.
     * 
     * @return
     *     possible object is
     *     {@link TotalCharges7 }
     *     
     */
    public TotalCharges7 getTtlChrgs() {
        return ttlChrgs;
    }

    /**
     * Sets the value of the ttlChrgs property.
     * 
     * @param value
     *     allowed object is
     *     {@link TotalCharges7 }
     *     
     */
    public GroupHeader126 setTtlChrgs(TotalCharges7 value) {
        this.ttlChrgs = value;
        return this;
    }

    /**
     * Gets the value of the chrgsAcct property.
     * 
     * @return
     *     possible object is
     *     {@link CashAccount40 }
     *     
     */
    public CashAccount40 getChrgsAcct() {
        return chrgsAcct;
    }

    /**
     * Sets the value of the chrgsAcct property.
     * 
     * @param value
     *     allowed object is
     *     {@link CashAccount40 }
     *     
     */
    public GroupHeader126 setChrgsAcct(CashAccount40 value) {
        this.chrgsAcct = value;
        return this;
    }

    /**
     * Gets the value of the chrgsAcctOwnr property.
     * 
     * @return
     *     possible object is
     *     {@link BranchAndFinancialInstitutionIdentification8 }
     *     
     */
    public BranchAndFinancialInstitutionIdentification8 getChrgsAcctOwnr() {
        return chrgsAcctOwnr;
    }

    /**
     * Sets the value of the chrgsAcctOwnr property.
     * 
     * @param value
     *     allowed object is
     *     {@link BranchAndFinancialInstitutionIdentification8 }
     *     
     */
    public GroupHeader126 setChrgsAcctOwnr(BranchAndFinancialInstitutionIdentification8 value) {
        this.chrgsAcctOwnr = value;
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

}
