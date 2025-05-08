
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
 * Context of the risk associated with the transaction.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RiskContext3", propOrder = {
    "inptData",
    "assmnt"
})
public class RiskContext3 {

    @XmlElement(name = "InptData")
    protected List<RiskInputData2> inptData;
    @XmlElement(name = "Assmnt")
    protected List<RiskAssessment3> assmnt;

    /**
     * Gets the value of the inptData property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the inptData property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getInptData().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RiskInputData2 }
     * 
     * 
     * @return
     *     The value of the inptData property.
     */
    public List<RiskInputData2> getInptData() {
        if (inptData == null) {
            inptData = new ArrayList<>();
        }
        return this.inptData;
    }

    /**
     * Gets the value of the assmnt property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the assmnt property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAssmnt().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RiskAssessment3 }
     * 
     * 
     * @return
     *     The value of the assmnt property.
     */
    public List<RiskAssessment3> getAssmnt() {
        if (assmnt == null) {
            assmnt = new ArrayList<>();
        }
        return this.assmnt;
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
     * Adds a new item to the inptData list.
     * @see #getInptData()
     * 
     */
    public RiskContext3 addInptData(RiskInputData2 inptData) {
        getInptData().add(inptData);
        return this;
    }

    /**
     * Adds a new item to the assmnt list.
     * @see #getAssmnt()
     * 
     */
    public RiskContext3 addAssmnt(RiskAssessment3 assmnt) {
        getAssmnt().add(assmnt);
        return this;
    }

}
