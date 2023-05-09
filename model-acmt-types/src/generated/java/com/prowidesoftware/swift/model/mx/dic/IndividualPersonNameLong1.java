
package com.prowidesoftware.swift.model.mx.dic;

import java.time.LocalDate;
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
 * First name of a person.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IndividualPersonNameLong1", propOrder = {
    "nmPrfx",
    "srnm",
    "gvnNm",
    "mddlNm",
    "initls",
    "nmSfx",
    "nm",
    "startDt",
    "endDt"
})
public class IndividualPersonNameLong1 {

    @XmlElement(name = "NmPrfx")
    protected NamePrefix2Choice nmPrfx;
    @XmlElement(name = "Srnm", required = true)
    protected String srnm;
    @XmlElement(name = "GvnNm")
    protected String gvnNm;
    @XmlElement(name = "MddlNm")
    protected String mddlNm;
    @XmlElement(name = "Initls")
    protected String initls;
    @XmlElement(name = "NmSfx")
    protected String nmSfx;
    @XmlElement(name = "Nm")
    protected String nm;
    @XmlElement(name = "StartDt", type = String.class)
    @XmlJavaTypeAdapter(IsoDateAdapter.class)
    @XmlSchemaType(name = "date")
    protected LocalDate startDt;
    @XmlElement(name = "EndDt", type = String.class)
    @XmlJavaTypeAdapter(IsoDateAdapter.class)
    @XmlSchemaType(name = "date")
    protected LocalDate endDt;

    /**
     * Gets the value of the nmPrfx property.
     * 
     * @return
     *     possible object is
     *     {@link NamePrefix2Choice }
     *     
     */
    public NamePrefix2Choice getNmPrfx() {
        return nmPrfx;
    }

    /**
     * Sets the value of the nmPrfx property.
     * 
     * @param value
     *     allowed object is
     *     {@link NamePrefix2Choice }
     *     
     */
    public IndividualPersonNameLong1 setNmPrfx(NamePrefix2Choice value) {
        this.nmPrfx = value;
        return this;
    }

    /**
     * Gets the value of the srnm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSrnm() {
        return srnm;
    }

    /**
     * Sets the value of the srnm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public IndividualPersonNameLong1 setSrnm(String value) {
        this.srnm = value;
        return this;
    }

    /**
     * Gets the value of the gvnNm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGvnNm() {
        return gvnNm;
    }

    /**
     * Sets the value of the gvnNm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public IndividualPersonNameLong1 setGvnNm(String value) {
        this.gvnNm = value;
        return this;
    }

    /**
     * Gets the value of the mddlNm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMddlNm() {
        return mddlNm;
    }

    /**
     * Sets the value of the mddlNm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public IndividualPersonNameLong1 setMddlNm(String value) {
        this.mddlNm = value;
        return this;
    }

    /**
     * Gets the value of the initls property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInitls() {
        return initls;
    }

    /**
     * Sets the value of the initls property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public IndividualPersonNameLong1 setInitls(String value) {
        this.initls = value;
        return this;
    }

    /**
     * Gets the value of the nmSfx property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNmSfx() {
        return nmSfx;
    }

    /**
     * Sets the value of the nmSfx property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public IndividualPersonNameLong1 setNmSfx(String value) {
        this.nmSfx = value;
        return this;
    }

    /**
     * Gets the value of the nm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNm() {
        return nm;
    }

    /**
     * Sets the value of the nm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public IndividualPersonNameLong1 setNm(String value) {
        this.nm = value;
        return this;
    }

    /**
     * Gets the value of the startDt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public LocalDate getStartDt() {
        return startDt;
    }

    /**
     * Sets the value of the startDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public IndividualPersonNameLong1 setStartDt(LocalDate value) {
        this.startDt = value;
        return this;
    }

    /**
     * Gets the value of the endDt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public LocalDate getEndDt() {
        return endDt;
    }

    /**
     * Sets the value of the endDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public IndividualPersonNameLong1 setEndDt(LocalDate value) {
        this.endDt = value;
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
