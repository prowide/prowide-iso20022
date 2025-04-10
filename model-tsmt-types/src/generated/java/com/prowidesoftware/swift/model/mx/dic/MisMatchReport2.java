
package com.prowidesoftware.swift.model.mx.dic;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Description of the mis-matched situation between two baselines or between a baseline and a data set.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MisMatchReport2", propOrder = {
    "nbOfMisMtchs",
    "misMtchInf"
})
public class MisMatchReport2 {

    @XmlElement(name = "NbOfMisMtchs", required = true)
    protected BigDecimal nbOfMisMtchs;
    @XmlElement(name = "MisMtchInf")
    protected List<ValidationResult4> misMtchInf;

    /**
     * Gets the value of the nbOfMisMtchs property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getNbOfMisMtchs() {
        return nbOfMisMtchs;
    }

    /**
     * Sets the value of the nbOfMisMtchs property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public MisMatchReport2 setNbOfMisMtchs(BigDecimal value) {
        this.nbOfMisMtchs = value;
        return this;
    }

    /**
     * Gets the value of the misMtchInf property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the misMtchInf property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMisMtchInf().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ValidationResult4 }
     * 
     * 
     */
    public List<ValidationResult4> getMisMtchInf() {
        if (misMtchInf == null) {
            misMtchInf = new ArrayList<ValidationResult4>();
        }
        return this.misMtchInf;
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
     * Adds a new item to the misMtchInf list.
     * @see #getMisMtchInf()
     * 
     */
    public MisMatchReport2 addMisMtchInf(ValidationResult4 misMtchInf) {
        getMisMtchInf().add(misMtchInf);
        return this;
    }

}
