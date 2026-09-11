
package com.prowidesoftware.swift.model.mx;

import com.prowidesoftware.swift.model.mx.dic.*;
import com.prowidesoftware.swift.model.mx.AbstractMX;

import com.prowidesoftware.swift.model.MxSwiftMessage;
import com.prowidesoftware.swift.model.mx.AbstractMX;
import com.prowidesoftware.swift.model.mx.MxRead;
import com.prowidesoftware.swift.model.mx.MxReadConfiguration;
import com.prowidesoftware.swift.model.mx.MxReadImpl;
import com.prowidesoftware.swift.model.mx.MxReadParams;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Class for reda.044.001.01 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "elgblCntrptCSDStsAdvc"
})
@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:reda.044.001.01")
public class MxReda04400101
    extends AbstractMX
{

    @XmlElement(name = "ElgblCntrptCSDStsAdvc", required = true)
    protected EligibleCounterpartCSDStatusAdviceV01 elgblCntrptCSDStsAdvc;
    public static final transient String BUSINESS_PROCESS = "reda";
    public static final transient int FUNCTIONALITY = 44;
    public static final transient int VARIANT = 1;
    public static final transient int VERSION = 1;
    @SuppressWarnings("rawtypes")
    public static final transient Class[] _classes = new Class[] {CollateralStatusReason1 .class, EligibleCounterpartCSDStatusAdviceV01 .class, MessageHeader12 .class, MxReda04400101 .class, OriginalBusinessInstruction1 .class, Status6Code.class, StatusReason6Choice.class, StatusReasonInformation10 .class, SupplementaryData1 .class, SupplementaryDataEnvelope1 .class };
    public static final transient String NAMESPACE = "urn:iso:std:iso:20022:tech:xsd:reda.044.001.01";

    public MxReda04400101() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxReda04400101(final String xml) {
        this();
        MxReda04400101 tmp = parse(xml);
        elgblCntrptCSDStsAdvc = tmp.getElgblCntrptCSDStsAdvc();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxReda04400101(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the elgblCntrptCSDStsAdvc property.
     * 
     * @return
     *     possible object is
     *     {@link EligibleCounterpartCSDStatusAdviceV01 }
     *     
     */
    public EligibleCounterpartCSDStatusAdviceV01 getElgblCntrptCSDStsAdvc() {
        return elgblCntrptCSDStsAdvc;
    }

    /**
     * Sets the value of the elgblCntrptCSDStsAdvc property.
     * 
     * @param value
     *     allowed object is
     *     {@link EligibleCounterpartCSDStatusAdviceV01 }
     *     
     */
    public MxReda04400101 setElgblCntrptCSDStsAdvc(EligibleCounterpartCSDStatusAdviceV01 value) {
        this.elgblCntrptCSDStsAdvc = value;
        return this;
    }

    @Override
    public String getBusinessProcess() {
        return BUSINESS_PROCESS;
    }

    @Override
    public int getFunctionality() {
        return FUNCTIONALITY;
    }

    @Override
    public int getVariant() {
        return VARIANT;
    }

    @Override
    public int getVersion() {
        return VERSION;
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML, using default unmarshalling options
     * 
     */
    public static MxReda04400101 parse(String xml) {
        return ((MxReda04400101) MxReadImpl.parse(MxReda04400101 .class, xml, _classes, new MxReadParams()));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML, using the provided unmarshalling options
     * @since 9.2.6
     * 
     */
    public static MxReda04400101 parse(String xml, MxReadConfiguration conf) {
        return ((MxReda04400101) MxReadImpl.parse(MxReda04400101 .class, xml, _classes, new MxReadParams(conf)));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxReda04400101 parse(String xml, MxRead parserImpl) {
        return ((MxReda04400101) parserImpl.read(MxReda04400101 .class, xml, _classes));
    }

    @Override
    public String getNamespace() {
        return NAMESPACE;
    }

    @Override
    @SuppressWarnings("rawtypes")
    public Class[] getClasses() {
        return _classes;
    }

    /**
     * Creates an MxReda04400101 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxReda04400101 message
     * @return
     *     a new instance of MxReda04400101
     */
    public static final MxReda04400101 fromJson(String json) {
        return AbstractMX.fromJson(json, MxReda04400101 .class);
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
