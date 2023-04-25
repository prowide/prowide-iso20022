
package com.prowidesoftware.swift.model.mx;

import com.prowidesoftware.swift.model.mx.dic.*;
import com.prowidesoftware.swift.model.mx.AbstractMX;

import com.prowidesoftware.swift.model.MxSwiftMessage;
import com.prowidesoftware.swift.model.mx.MxRead;
import com.prowidesoftware.swift.model.mx.MxReadConfiguration;
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
 * Class for seev.040.002.05 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "corpActnInstrCxlReq"
})
@XmlRootElement(name = "Document", namespace = "urn:swift:xsd:seev.040.002.05")
public class MxSeev04000205
    extends com.prowidesoftware.swift.model.mx.AbstractMX
{

    @XmlElement(name = "CorpActnInstrCxlReq", required = true)
    protected CorporateActionInstructionCancellationRequest002V05 corpActnInstrCxlReq;
    public static final transient String BUSINESS_PROCESS = "seev";
    public static final transient int FUNCTIONALITY = 40;
    public static final transient int VARIANT = 2;
    public static final transient int VERSION = 5;
    @SuppressWarnings("rawtypes")
    public static final transient Class[] _classes = new Class[] {AccountIdentification21 .class, CorporateActionEventType10Code.class, CorporateActionEventType22Choice.class, CorporateActionGeneralInformation68 .class, CorporateActionInstructionCancellationRequest002V05 .class, CorporateActionOption15Choice.class, CorporateActionOption43 .class, CorporateActionOption9Code.class, DocumentIdentification19 .class, FinancialInstrumentQuantity15Choice.class, GenericIdentification24 .class, GenericIdentification25 .class, GenericIdentification26 .class, IdentificationSource4Choice.class, InstructedOrQuantityToReceive2Choice.class, MxSeev04000205 .class, OptionNumber1Choice.class, OptionNumber1Code.class, OriginalAndCurrentQuantities4 .class, OtherIdentification2 .class, PartyIdentification51Choice.class, ProcessingPosition3Choice.class, ProcessingPosition3Code.class, Quantity11Choice.class, Quantity1Code.class, SafekeepingPlace1Code.class, SafekeepingPlace2Code.class, SafekeepingPlaceFormat5Choice.class, SafekeepingPlaceTypeAndAnyBICIdentifier1 .class, SafekeepingPlaceTypeAndText5 .class, SecurityIdentification15 .class, SupplementaryData1 .class, SupplementaryDataEnvelope1 .class };
    public static final transient String NAMESPACE = "urn:swift:xsd:seev.040.002.05";

    public MxSeev04000205() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxSeev04000205(final String xml) {
        this();
        MxSeev04000205 tmp = parse(xml);
        corpActnInstrCxlReq = tmp.getCorpActnInstrCxlReq();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxSeev04000205(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the corpActnInstrCxlReq property.
     * 
     * @return
     *     possible object is
     *     {@link CorporateActionInstructionCancellationRequest002V05 }
     *     
     */
    public CorporateActionInstructionCancellationRequest002V05 getCorpActnInstrCxlReq() {
        return corpActnInstrCxlReq;
    }

    /**
     * Sets the value of the corpActnInstrCxlReq property.
     * 
     * @param value
     *     allowed object is
     *     {@link CorporateActionInstructionCancellationRequest002V05 }
     *     
     */
    public MxSeev04000205 setCorpActnInstrCxlReq(CorporateActionInstructionCancellationRequest002V05 value) {
        this.corpActnInstrCxlReq = value;
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
    public static MxSeev04000205 parse(String xml) {
        return ((MxSeev04000205) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxSeev04000205 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams()));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML, using the provided unmarshalling options
     * @since 9.2.6
     * 
     */
    public static MxSeev04000205 parse(String xml, MxReadConfiguration conf) {
        return ((MxSeev04000205) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxSeev04000205 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams(conf)));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxSeev04000205 parse(String xml, MxRead parserImpl) {
        return ((MxSeev04000205) parserImpl.read(MxSeev04000205 .class, xml, _classes));
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
     * Creates an MxSeev04000205 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxSeev04000205 message
     * @return
     *     a new instance of MxSeev04000205
     */
    public static final MxSeev04000205 fromJson(String json) {
        return com.prowidesoftware.swift.model.mx.AbstractMX.fromJson(json, MxSeev04000205 .class);
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
