
package com.prowidesoftware.swift.model.mx.dic;

import java.time.OffsetDateTime;
import com.prowidesoftware.swift.model.mx.adapters.IsoDateTimeAdapter;
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
 * Identification of partners involved in exchange from the merchant to the issuer, with the relative timestamp of their exchanges.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Traceability10", propOrder = {
    "id",
    "tp",
    "othrTp",
    "assgnr",
    "ctry",
    "shrtNm",
    "dtTmIn",
    "dtTmOut"
})
public class Traceability10 {

    @XmlElement(name = "Id", required = true)
    protected String id;
    @XmlElement(name = "Tp")
    @XmlSchemaType(name = "string")
    protected PartyType17Code tp;
    @XmlElement(name = "OthrTp")
    protected String othrTp;
    @XmlElement(name = "Assgnr")
    @XmlSchemaType(name = "string")
    protected PartyType18Code assgnr;
    @XmlElement(name = "Ctry")
    protected String ctry;
    @XmlElement(name = "ShrtNm")
    protected String shrtNm;
    @XmlElement(name = "DtTmIn", type = String.class)
    @XmlJavaTypeAdapter(IsoDateTimeAdapter.class)
    @XmlSchemaType(name = "dateTime")
    protected OffsetDateTime dtTmIn;
    @XmlElement(name = "DtTmOut", type = String.class)
    @XmlJavaTypeAdapter(IsoDateTimeAdapter.class)
    @XmlSchemaType(name = "dateTime")
    protected OffsetDateTime dtTmOut;

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
    public Traceability10 setId(String value) {
        this.id = value;
        return this;
    }

    /**
     * Gets the value of the tp property.
     * 
     * @return
     *     possible object is
     *     {@link PartyType17Code }
     *     
     */
    public PartyType17Code getTp() {
        return tp;
    }

    /**
     * Sets the value of the tp property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyType17Code }
     *     
     */
    public Traceability10 setTp(PartyType17Code value) {
        this.tp = value;
        return this;
    }

    /**
     * Gets the value of the othrTp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOthrTp() {
        return othrTp;
    }

    /**
     * Sets the value of the othrTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public Traceability10 setOthrTp(String value) {
        this.othrTp = value;
        return this;
    }

    /**
     * Gets the value of the assgnr property.
     * 
     * @return
     *     possible object is
     *     {@link PartyType18Code }
     *     
     */
    public PartyType18Code getAssgnr() {
        return assgnr;
    }

    /**
     * Sets the value of the assgnr property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyType18Code }
     *     
     */
    public Traceability10 setAssgnr(PartyType18Code value) {
        this.assgnr = value;
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
    public Traceability10 setCtry(String value) {
        this.ctry = value;
        return this;
    }

    /**
     * Gets the value of the shrtNm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShrtNm() {
        return shrtNm;
    }

    /**
     * Sets the value of the shrtNm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public Traceability10 setShrtNm(String value) {
        this.shrtNm = value;
        return this;
    }

    /**
     * Gets the value of the dtTmIn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public OffsetDateTime getDtTmIn() {
        return dtTmIn;
    }

    /**
     * Sets the value of the dtTmIn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public Traceability10 setDtTmIn(OffsetDateTime value) {
        this.dtTmIn = value;
        return this;
    }

    /**
     * Gets the value of the dtTmOut property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public OffsetDateTime getDtTmOut() {
        return dtTmOut;
    }

    /**
     * Sets the value of the dtTmOut property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public Traceability10 setDtTmOut(OffsetDateTime value) {
        this.dtTmOut = value;
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
