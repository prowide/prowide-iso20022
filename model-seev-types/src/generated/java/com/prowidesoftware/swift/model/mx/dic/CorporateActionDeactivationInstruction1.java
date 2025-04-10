
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
 * Provides information about the deactivation.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CorporateActionDeactivationInstruction1", propOrder = {
    "deactvtnDtAndTm",
    "optnDtls"
})
public class CorporateActionDeactivationInstruction1 {

    @XmlElement(name = "DeactvtnDtAndTm", required = true, type = String.class)
    @XmlJavaTypeAdapter(IsoDateTimeAdapter.class)
    @XmlSchemaType(name = "dateTime")
    protected OffsetDateTime deactvtnDtAndTm;
    @XmlElement(name = "OptnDtls")
    protected List<CorporateActionOption2> optnDtls;

    /**
     * Gets the value of the deactvtnDtAndTm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public OffsetDateTime getDeactvtnDtAndTm() {
        return deactvtnDtAndTm;
    }

    /**
     * Sets the value of the deactvtnDtAndTm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public CorporateActionDeactivationInstruction1 setDeactvtnDtAndTm(OffsetDateTime value) {
        this.deactvtnDtAndTm = value;
        return this;
    }

    /**
     * Gets the value of the optnDtls property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the optnDtls property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOptnDtls().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CorporateActionOption2 }
     * 
     * 
     * @return
     *     The value of the optnDtls property.
     */
    public List<CorporateActionOption2> getOptnDtls() {
        if (optnDtls == null) {
            optnDtls = new ArrayList<>();
        }
        return this.optnDtls;
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
     * Adds a new item to the optnDtls list.
     * @see #getOptnDtls()
     * 
     */
    public CorporateActionDeactivationInstruction1 addOptnDtls(CorporateActionOption2 optnDtls) {
        getOptnDtls().add(optnDtls);
        return this;
    }

}
