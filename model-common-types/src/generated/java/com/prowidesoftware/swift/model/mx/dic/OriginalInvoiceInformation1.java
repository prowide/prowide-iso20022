
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
 * General information about the invoice contained in the original request.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OriginalInvoiceInformation1", propOrder = {
    "docNb",
    "ttlInvcAmt",
    "isseDt",
    "pmtDueDt"
})
public class OriginalInvoiceInformation1 {

    @XmlElement(name = "DocNb", required = true)
    protected String docNb;
    @XmlElement(name = "TtlInvcAmt", required = true)
    protected ActiveCurrencyAndAmount ttlInvcAmt;
    @XmlElement(name = "IsseDt", required = true, type = String.class)
    @XmlJavaTypeAdapter(IsoDateAdapter.class)
    @XmlSchemaType(name = "date")
    protected Calendar isseDt;
    @XmlElement(name = "PmtDueDt", required = true, type = String.class)
    @XmlJavaTypeAdapter(IsoDateAdapter.class)
    @XmlSchemaType(name = "date")
    protected Calendar pmtDueDt;

    /**
     * Gets the value of the docNb property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDocNb() {
        return docNb;
    }

    /**
     * Sets the value of the docNb property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public OriginalInvoiceInformation1 setDocNb(String value) {
        this.docNb = value;
        return this;
    }

    /**
     * Gets the value of the ttlInvcAmt property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public ActiveCurrencyAndAmount getTtlInvcAmt() {
        return ttlInvcAmt;
    }

    /**
     * Sets the value of the ttlInvcAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public OriginalInvoiceInformation1 setTtlInvcAmt(ActiveCurrencyAndAmount value) {
        this.ttlInvcAmt = value;
        return this;
    }

    /**
     * Gets the value of the isseDt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Calendar getIsseDt() {
        return isseDt;
    }

    /**
     * Sets the value of the isseDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public OriginalInvoiceInformation1 setIsseDt(Calendar value) {
        this.isseDt = value;
        return this;
    }

    /**
     * Gets the value of the pmtDueDt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Calendar getPmtDueDt() {
        return pmtDueDt;
    }

    /**
     * Sets the value of the pmtDueDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public OriginalInvoiceInformation1 setPmtDueDt(Calendar value) {
        this.pmtDueDt = value;
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
