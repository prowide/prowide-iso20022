
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
 * Agreement details for the over the counter market.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Agreement2", propOrder = {
    "agrmtDtls",
    "agrmtId",
    "agrmtDt",
    "baseCcy",
    "agrmtFrmwk"
})
public class Agreement2 {

    @XmlElement(name = "AgrmtDtls", required = true)
    protected String agrmtDtls;
    @XmlElement(name = "AgrmtId")
    protected String agrmtId;
    @XmlElement(name = "AgrmtDt", required = true, type = String.class)
    @XmlJavaTypeAdapter(IsoDateAdapter.class)
    @XmlSchemaType(name = "date")
    protected LocalDate agrmtDt;
    @XmlElement(name = "BaseCcy", required = true)
    protected String baseCcy;
    @XmlElement(name = "AgrmtFrmwk")
    protected AgreementFramework1Choice agrmtFrmwk;

    /**
     * Gets the value of the agrmtDtls property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAgrmtDtls() {
        return agrmtDtls;
    }

    /**
     * Sets the value of the agrmtDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public Agreement2 setAgrmtDtls(String value) {
        this.agrmtDtls = value;
        return this;
    }

    /**
     * Gets the value of the agrmtId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAgrmtId() {
        return agrmtId;
    }

    /**
     * Sets the value of the agrmtId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public Agreement2 setAgrmtId(String value) {
        this.agrmtId = value;
        return this;
    }

    /**
     * Gets the value of the agrmtDt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public LocalDate getAgrmtDt() {
        return agrmtDt;
    }

    /**
     * Sets the value of the agrmtDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public Agreement2 setAgrmtDt(LocalDate value) {
        this.agrmtDt = value;
        return this;
    }

    /**
     * Gets the value of the baseCcy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBaseCcy() {
        return baseCcy;
    }

    /**
     * Sets the value of the baseCcy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public Agreement2 setBaseCcy(String value) {
        this.baseCcy = value;
        return this;
    }

    /**
     * Gets the value of the agrmtFrmwk property.
     * 
     * @return
     *     possible object is
     *     {@link AgreementFramework1Choice }
     *     
     */
    public AgreementFramework1Choice getAgrmtFrmwk() {
        return agrmtFrmwk;
    }

    /**
     * Sets the value of the agrmtFrmwk property.
     * 
     * @param value
     *     allowed object is
     *     {@link AgreementFramework1Choice }
     *     
     */
    public Agreement2 setAgrmtFrmwk(AgreementFramework1Choice value) {
        this.agrmtFrmwk = value;
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
