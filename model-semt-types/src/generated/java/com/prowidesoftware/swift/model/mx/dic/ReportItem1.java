
package com.prowidesoftware.swift.model.mx.dic;

import java.util.Calendar;
import com.prowidesoftware.swift.model.mx.adapters.IsoDateAdapter;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Account details of the report item.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ReportItem1", propOrder = {
    "acctId",
    "acctLvl",
    "finInstrmId",
    "itmDt"
})
public class ReportItem1 {

    @XmlElement(name = "AcctId", required = true)
    protected SecuritiesAccount19 acctId;
    @XmlElement(name = "AcctLvl", required = true)
    @XmlSchemaType(name = "string")
    protected HoldingAccountLevel1Code acctLvl;
    @XmlElement(name = "FinInstrmId")
    protected SecurityIdentification19 finInstrmId;
    @XmlElement(name = "ItmDt", type = String.class)
    @XmlJavaTypeAdapter(IsoDateAdapter.class)
    @XmlSchemaType(name = "date")
    protected Calendar itmDt;

    /**
     * Gets the value of the acctId property.
     * 
     * @return
     *     possible object is
     *     {@link SecuritiesAccount19 }
     *     
     */
    public SecuritiesAccount19 getAcctId() {
        return acctId;
    }

    /**
     * Sets the value of the acctId property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecuritiesAccount19 }
     *     
     */
    public ReportItem1 setAcctId(SecuritiesAccount19 value) {
        this.acctId = value;
        return this;
    }

    /**
     * Gets the value of the acctLvl property.
     * 
     * @return
     *     possible object is
     *     {@link HoldingAccountLevel1Code }
     *     
     */
    public HoldingAccountLevel1Code getAcctLvl() {
        return acctLvl;
    }

    /**
     * Sets the value of the acctLvl property.
     * 
     * @param value
     *     allowed object is
     *     {@link HoldingAccountLevel1Code }
     *     
     */
    public ReportItem1 setAcctLvl(HoldingAccountLevel1Code value) {
        this.acctLvl = value;
        return this;
    }

    /**
     * Gets the value of the finInstrmId property.
     * 
     * @return
     *     possible object is
     *     {@link SecurityIdentification19 }
     *     
     */
    public SecurityIdentification19 getFinInstrmId() {
        return finInstrmId;
    }

    /**
     * Sets the value of the finInstrmId property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecurityIdentification19 }
     *     
     */
    public ReportItem1 setFinInstrmId(SecurityIdentification19 value) {
        this.finInstrmId = value;
        return this;
    }

    /**
     * Gets the value of the itmDt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Calendar getItmDt() {
        return itmDt;
    }

    /**
     * Sets the value of the itmDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public ReportItem1 setItmDt(Calendar value) {
        this.itmDt = value;
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
