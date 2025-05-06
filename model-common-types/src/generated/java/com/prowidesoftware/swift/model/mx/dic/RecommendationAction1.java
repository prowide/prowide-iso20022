
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
 * Recommended actions as result of risk assessment.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RecommendationAction1", propOrder = {
    "actn",
    "othrActn",
    "dtls"
})
public class RecommendationAction1 {

    @XmlElement(name = "Actn")
    @XmlSchemaType(name = "string")
    protected ActionType8Code actn;
    @XmlElement(name = "OthrActn")
    protected String othrActn;
    @XmlElement(name = "Dtls")
    protected List<String> dtls;

    /**
     * Gets the value of the actn property.
     * 
     * @return
     *     possible object is
     *     {@link ActionType8Code }
     *     
     */
    public ActionType8Code getActn() {
        return actn;
    }

    /**
     * Sets the value of the actn property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActionType8Code }
     *     
     */
    public RecommendationAction1 setActn(ActionType8Code value) {
        this.actn = value;
        return this;
    }

    /**
     * Gets the value of the othrActn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOthrActn() {
        return othrActn;
    }

    /**
     * Sets the value of the othrActn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public RecommendationAction1 setOthrActn(String value) {
        this.othrActn = value;
        return this;
    }

    /**
     * Gets the value of the dtls property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the dtls property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDtls().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     * @return
     *     The value of the dtls property.
     */
    public List<String> getDtls() {
        if (dtls == null) {
            dtls = new ArrayList<>();
        }
        return this.dtls;
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
     * Adds a new item to the dtls list.
     * @see #getDtls()
     * 
     */
    public RecommendationAction1 addDtls(String dtls) {
        getDtls().add(dtls);
        return this;
    }

}
