
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
 * Content of the management plan.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ManagementPlanContent2", propOrder = {
    "actn"
})
public class ManagementPlanContent2 {

    @XmlElement(name = "Actn", required = true)
    protected List<TMSAction2> actn;

    /**
     * Gets the value of the actn property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the actn property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getActn().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TMSAction2 }
     * 
     * 
     * @return
     *     The value of the actn property.
     */
    public List<TMSAction2> getActn() {
        if (actn == null) {
            actn = new ArrayList<>();
        }
        return this.actn;
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
     * Adds a new item to the actn list.
     * @see #getActn()
     * 
     */
    public ManagementPlanContent2 addActn(TMSAction2 actn) {
        getActn().add(actn);
        return this;
    }

}
