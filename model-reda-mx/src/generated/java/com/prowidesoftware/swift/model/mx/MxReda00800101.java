
package com.prowidesoftware.swift.model.mx;

import com.prowidesoftware.swift.model.mx.dic.*;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;
import com.prowidesoftware.swift.model.MxSwiftMessage;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Class for reda.008.001.01 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "sctyCreStsAdvc"
})
@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:reda.008.001.01")
public class MxReda00800101
    extends com.prowidesoftware.swift.model.mx.AbstractMX
{

    @XmlElement(name = "SctyCreStsAdvc", required = true)
    protected SecurityCreationStatusAdviceV01 sctyCreStsAdvc;
    public final static transient String BUSINESS_PROCESS = "reda";
    public final static transient int FUNCTIONALITY = 8;
    public final static transient int VARIANT = 1;
    public final static transient int VERSION = 1;
    @SuppressWarnings("rawtypes")
    public final static transient Class[] _classes = new Class[] {GenericIdentification30 .class, IdentificationSource3Choice.class, MessageHeader12 .class, MxReda00800101 .class, NoReasonCode.class, OriginalBusinessInstruction1 .class, OtherIdentification1 .class, ProcessingStatus72Choice.class, ProprietaryReason4 .class, ProprietaryStatusAndReason6 .class, Reason18Choice.class, Reason4 .class, SecurityCreationStatusAdviceV01 .class, SecurityIdentification39 .class, SupplementaryData1 .class, SupplementaryDataEnvelope1 .class };
    public final static transient String NAMESPACE = "urn:iso:std:iso:20022:tech:xsd:reda.008.001.01";

    public MxReda00800101() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxReda00800101(final String xml) {
        this();
        MxReda00800101 tmp = parse(xml);
        sctyCreStsAdvc = tmp.getSctyCreStsAdvc();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxReda00800101(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the sctyCreStsAdvc property.
     * 
     * @return
     *     possible object is
     *     {@link SecurityCreationStatusAdviceV01 }
     *     
     */
    public SecurityCreationStatusAdviceV01 getSctyCreStsAdvc() {
        return sctyCreStsAdvc;
    }

    /**
     * Sets the value of the sctyCreStsAdvc property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecurityCreationStatusAdviceV01 }
     *     
     */
    public MxReda00800101 setSctyCreStsAdvc(SecurityCreationStatusAdviceV01 value) {
        this.sctyCreStsAdvc = value;
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
    public static MxReda00800101 parse(String xml) {
        return ((MxReda00800101) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxReda00800101 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams()));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML, using the provided unmarshalling options
     * @since 9.2.6
     * 
     */
    public static MxReda00800101 parse(String xml, MxReadConfiguration conf) {
        return ((MxReda00800101) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxReda00800101 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams(conf)));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxReda00800101 parse(String xml, MxRead parserImpl) {
        return ((MxReda00800101) parserImpl.read(MxReda00800101 .class, xml, _classes));
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
     * Creates an MxReda00800101 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxReda00800101 message
     * @return
     *     a new instance of MxReda00800101
     */
    public final static MxReda00800101 fromJson(String json) {
        return com.prowidesoftware.swift.model.mx.AbstractMX.fromJson(json, MxReda00800101 .class);
    }

}
