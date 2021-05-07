
package com.prowidesoftware.swift.model.mx;

import com.prowidesoftware.swift.model.mx.dic.*;
import com.prowidesoftware.swift.model.mx.AbstractMX;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.prowidesoftware.swift.model.MxSwiftMessage;
import com.prowidesoftware.swift.model.mx.MxRead;
import com.prowidesoftware.swift.model.mx.MxReadImpl;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Class for seev.006.001.02 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "mtgInstrSts"
})
@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:seev.006.001.02")
public class MxSeev00600102
    extends com.prowidesoftware.swift.model.mx.AbstractMX
{

    @XmlElement(name = "MtgInstrSts", required = true)
    protected MeetingInstructionStatusV02 mtgInstrSts;
    public final static transient String BUSINESS_PROCESS = "seev";
    public final static transient int FUNCTIONALITY = 6;
    public final static transient int VARIANT = 1;
    public final static transient int VERSION = 2;
    @SuppressWarnings("rawtypes")
    public final static transient Class[] _classes = new Class[] {AddressType2Code.class, AlternateFinancialInstrumentIdentification1 .class, CancellationProcessingStatus1 .class, CancellationRejectionStatus1 .class, CancellationStatus1Choice.class, CancellationStatus3Code.class, DetailedInstructionStatus1 .class, GenericIdentification1 .class, InstructionProcessingStatus1 .class, InstructionRejectionStatus1 .class, InstructionStatus1Choice.class, InstructionStatus2Choice.class, MeetingInstructionStatusV02 .class, MeetingReference3 .class, MeetingType2Code.class, MeetingTypeClassification1Code.class, MessageIdentification.class, MessageIdentification1 .class, MxSeev00600102 .class, NameAndAddress5 .class, PartyIdentification9Choice.class, PostalAddress1 .class, RejectionReason1Code.class, RejectionReason2Code.class, SecurityIdentification3 .class, Status3Code.class };
    public final static transient String NAMESPACE = "urn:iso:std:iso:20022:tech:xsd:seev.006.001.02";

    public MxSeev00600102() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxSeev00600102(final String xml) {
        this();
        MxSeev00600102 tmp = parse(xml);
        mtgInstrSts = tmp.getMtgInstrSts();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxSeev00600102(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the mtgInstrSts property.
     * 
     * @return
     *     possible object is
     *     {@link MeetingInstructionStatusV02 }
     *     
     */
    public MeetingInstructionStatusV02 getMtgInstrSts() {
        return mtgInstrSts;
    }

    /**
     * Sets the value of the mtgInstrSts property.
     * 
     * @param value
     *     allowed object is
     *     {@link MeetingInstructionStatusV02 }
     *     
     */
    public MxSeev00600102 setMtgInstrSts(MeetingInstructionStatusV02 value) {
        this.mtgInstrSts = value;
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
     * Creates the MX object parsing the raw content from the parameter XML
     * 
     */
    public static MxSeev00600102 parse(String xml) {
        return ((MxSeev00600102) MxReadImpl.parse(MxSeev00600102 .class, xml, _classes));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxSeev00600102 parse(String xml, MxRead parserImpl) {
        return ((MxSeev00600102) parserImpl.read(MxSeev00600102 .class, xml, _classes));
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
     * Creates an MxSeev00600102 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxSeev00600102 message
     * @return
     *     a new instance of MxSeev00600102
     */
    public final static MxSeev00600102 fromJson(String json) {
        return com.prowidesoftware.swift.model.mx.AbstractMX.fromJson(json, MxSeev00600102 .class);
    }

}
