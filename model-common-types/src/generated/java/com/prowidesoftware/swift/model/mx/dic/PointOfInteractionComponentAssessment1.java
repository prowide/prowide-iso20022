
package com.prowidesoftware.swift.model.mx.dic;

import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;
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
 * Assessments for the component of the point of interaction.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PointOfInteractionComponentAssessment1", propOrder = {
    "tp",
    "assgnr",
    "dlvryDt",
    "xprtnDt",
    "nb"
})
public class PointOfInteractionComponentAssessment1 {

    @XmlElement(name = "Tp", required = true)
    @XmlSchemaType(name = "string")
    protected POIComponentAssessment1Code tp;
    @XmlElement(name = "Assgnr", required = true)
    protected List<String> assgnr;
    @XmlElement(name = "DlvryDt", type = String.class)
    @XmlJavaTypeAdapter(IsoDateTimeAdapter.class)
    @XmlSchemaType(name = "dateTime")
    protected OffsetDateTime dlvryDt;
    @XmlElement(name = "XprtnDt", type = String.class)
    @XmlJavaTypeAdapter(IsoDateTimeAdapter.class)
    @XmlSchemaType(name = "dateTime")
    protected OffsetDateTime xprtnDt;
    @XmlElement(name = "Nb", required = true)
    protected String nb;

    /**
     * Gets the value of the tp property.
     * 
     * @return
     *     possible object is
     *     {@link POIComponentAssessment1Code }
     *     
     */
    public POIComponentAssessment1Code getTp() {
        return tp;
    }

    /**
     * Sets the value of the tp property.
     * 
     * @param value
     *     allowed object is
     *     {@link POIComponentAssessment1Code }
     *     
     */
    public PointOfInteractionComponentAssessment1 setTp(POIComponentAssessment1Code value) {
        this.tp = value;
        return this;
    }

    /**
     * Gets the value of the assgnr property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the assgnr property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAssgnr().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     * @return
     *     The value of the assgnr property.
     */
    public List<String> getAssgnr() {
        if (assgnr == null) {
            assgnr = new ArrayList<>();
        }
        return this.assgnr;
    }

    /**
     * Gets the value of the dlvryDt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public OffsetDateTime getDlvryDt() {
        return dlvryDt;
    }

    /**
     * Sets the value of the dlvryDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public PointOfInteractionComponentAssessment1 setDlvryDt(OffsetDateTime value) {
        this.dlvryDt = value;
        return this;
    }

    /**
     * Gets the value of the xprtnDt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public OffsetDateTime getXprtnDt() {
        return xprtnDt;
    }

    /**
     * Sets the value of the xprtnDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public PointOfInteractionComponentAssessment1 setXprtnDt(OffsetDateTime value) {
        this.xprtnDt = value;
        return this;
    }

    /**
     * Gets the value of the nb property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNb() {
        return nb;
    }

    /**
     * Sets the value of the nb property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public PointOfInteractionComponentAssessment1 setNb(String value) {
        this.nb = value;
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
     * Adds a new item to the assgnr list.
     * @see #getAssgnr()
     * 
     */
    public PointOfInteractionComponentAssessment1 addAssgnr(String assgnr) {
        getAssgnr().add(assgnr);
        return this;
    }

}
