
package com.prowidesoftware.swift.model.mx.dic;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Statistical information on the processing of records included in the original report.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OriginalReportStatistics3", propOrder = {
    "ttlNbOfRcrds",
    "nbOfRcrdsPerSts"
})
public class OriginalReportStatistics3 {

    @XmlElement(name = "TtlNbOfRcrds", required = true)
    protected String ttlNbOfRcrds;
    @XmlElement(name = "NbOfRcrdsPerSts", required = true)
    protected List<NumberOfRecordsPerStatus1> nbOfRcrdsPerSts;

    /**
     * Gets the value of the ttlNbOfRcrds property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTtlNbOfRcrds() {
        return ttlNbOfRcrds;
    }

    /**
     * Sets the value of the ttlNbOfRcrds property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public OriginalReportStatistics3 setTtlNbOfRcrds(String value) {
        this.ttlNbOfRcrds = value;
        return this;
    }

    /**
     * Gets the value of the nbOfRcrdsPerSts property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the nbOfRcrdsPerSts property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNbOfRcrdsPerSts().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link NumberOfRecordsPerStatus1 }
     * 
     * 
     */
    public List<NumberOfRecordsPerStatus1> getNbOfRcrdsPerSts() {
        if (nbOfRcrdsPerSts == null) {
            nbOfRcrdsPerSts = new ArrayList<NumberOfRecordsPerStatus1>();
        }
        return this.nbOfRcrdsPerSts;
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
     * Adds a new item to the nbOfRcrdsPerSts list.
     * @see #getNbOfRcrdsPerSts()
     * 
     */
    public OriginalReportStatistics3 addNbOfRcrdsPerSts(NumberOfRecordsPerStatus1 nbOfRcrdsPerSts) {
        getNbOfRcrdsPerSts().add(nbOfRcrdsPerSts);
        return this;
    }

}
