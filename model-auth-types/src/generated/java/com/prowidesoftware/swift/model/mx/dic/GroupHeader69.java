
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
 * Set of characteristics shared by all individual transactions included in the message.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GroupHeader69", propOrder = {
    "id",
    "issdDt",
    "rptCtgy",
    "taxRptPurp",
    "orgnlId",
    "sellrTaxRprtv",
    "buyrTaxRprtv",
    "langCd"
})
public class GroupHeader69 {

    @XmlElement(name = "Id", required = true)
    protected String id;
    @XmlElement(name = "IssdDt", required = true, type = String.class)
    @XmlJavaTypeAdapter(IsoDateAdapter.class)
    @XmlSchemaType(name = "date")
    protected Calendar issdDt;
    @XmlElement(name = "RptCtgy", required = true)
    protected String rptCtgy;
    @XmlElement(name = "TaxRptPurp", required = true)
    protected String taxRptPurp;
    @XmlElement(name = "OrgnlId")
    protected String orgnlId;
    @XmlElement(name = "SellrTaxRprtv")
    protected PartyIdentification116 sellrTaxRprtv;
    @XmlElement(name = "BuyrTaxRprtv")
    protected PartyIdentification116 buyrTaxRprtv;
    @XmlElement(name = "LangCd")
    protected String langCd;

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public GroupHeader69 setId(String value) {
        this.id = value;
        return this;
    }

    /**
     * Gets the value of the issdDt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Calendar getIssdDt() {
        return issdDt;
    }

    /**
     * Sets the value of the issdDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public GroupHeader69 setIssdDt(Calendar value) {
        this.issdDt = value;
        return this;
    }

    /**
     * Gets the value of the rptCtgy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRptCtgy() {
        return rptCtgy;
    }

    /**
     * Sets the value of the rptCtgy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public GroupHeader69 setRptCtgy(String value) {
        this.rptCtgy = value;
        return this;
    }

    /**
     * Gets the value of the taxRptPurp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTaxRptPurp() {
        return taxRptPurp;
    }

    /**
     * Sets the value of the taxRptPurp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public GroupHeader69 setTaxRptPurp(String value) {
        this.taxRptPurp = value;
        return this;
    }

    /**
     * Gets the value of the orgnlId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrgnlId() {
        return orgnlId;
    }

    /**
     * Sets the value of the orgnlId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public GroupHeader69 setOrgnlId(String value) {
        this.orgnlId = value;
        return this;
    }

    /**
     * Gets the value of the sellrTaxRprtv property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification116 }
     *     
     */
    public PartyIdentification116 getSellrTaxRprtv() {
        return sellrTaxRprtv;
    }

    /**
     * Sets the value of the sellrTaxRprtv property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification116 }
     *     
     */
    public GroupHeader69 setSellrTaxRprtv(PartyIdentification116 value) {
        this.sellrTaxRprtv = value;
        return this;
    }

    /**
     * Gets the value of the buyrTaxRprtv property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification116 }
     *     
     */
    public PartyIdentification116 getBuyrTaxRprtv() {
        return buyrTaxRprtv;
    }

    /**
     * Sets the value of the buyrTaxRprtv property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification116 }
     *     
     */
    public GroupHeader69 setBuyrTaxRprtv(PartyIdentification116 value) {
        this.buyrTaxRprtv = value;
        return this;
    }

    /**
     * Gets the value of the langCd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLangCd() {
        return langCd;
    }

    /**
     * Sets the value of the langCd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public GroupHeader69 setLangCd(String value) {
        this.langCd = value;
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
