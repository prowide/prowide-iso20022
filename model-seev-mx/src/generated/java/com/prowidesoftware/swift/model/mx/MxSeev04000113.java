
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
 * Class for seev.040.001.13 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "corpActnInstrCxlReq"
})
@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:seev.040.001.13")
public class MxSeev04000113
    extends com.prowidesoftware.swift.model.mx.AbstractMX
{

    @XmlElement(name = "CorpActnInstrCxlReq", required = true)
    protected CorporateActionInstructionCancellationRequestV13 corpActnInstrCxlReq;
    public static final transient String BUSINESS_PROCESS = "seev";
    public static final transient int FUNCTIONALITY = 40;
    public static final transient int VARIANT = 1;
    public static final transient int VERSION = 13;
    @SuppressWarnings("rawtypes")
    public static final transient Class[] _classes = new Class[] {AccountIdentification69 .class, CorporateActionEventType112Choice.class, CorporateActionEventType40Code.class, CorporateActionGeneralInformation183 .class, CorporateActionInstructionCancellationRequestV13 .class, CorporateActionNarrative10 .class, CorporateActionOption16Code.class, CorporateActionOption200 .class, CorporateActionOption40Choice.class, DocumentIdentification31 .class, FinancialInstrumentQuantity33Choice.class, GenericIdentification30 .class, GenericIdentification36 .class, GenericIdentification78 .class, IdentificationSource3Choice.class, MxSeev04000113 .class, OptionNumber1Choice.class, OptionNumber1Code.class, OriginalAndCurrentQuantities1 .class, OtherIdentification1 .class, PartyIdentification127Choice.class, ProcessingPosition3Code.class, ProcessingPosition7Choice.class, ProtectInstruction3 .class, ProtectTransactionType3Code.class, Quantity1Code.class, Quantity52Choice.class, SafekeepingPlace1Code.class, SafekeepingPlace2Code.class, SafekeepingPlaceFormat42Choice.class, SafekeepingPlaceTypeAndIdentification1 .class, SafekeepingPlaceTypeAndText6 .class, SecurityIdentification19 .class, SupplementaryData1 .class, SupplementaryDataEnvelope1 .class };
    public static final transient String NAMESPACE = "urn:iso:std:iso:20022:tech:xsd:seev.040.001.13";

    public MxSeev04000113() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxSeev04000113(final String xml) {
        this();
        MxSeev04000113 tmp = parse(xml);
        corpActnInstrCxlReq = tmp.getCorpActnInstrCxlReq();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxSeev04000113(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the corpActnInstrCxlReq property.
     * 
     * @return
     *     possible object is
     *     {@link CorporateActionInstructionCancellationRequestV13 }
     *     
     */
    public CorporateActionInstructionCancellationRequestV13 getCorpActnInstrCxlReq() {
        return corpActnInstrCxlReq;
    }

    /**
     * Sets the value of the corpActnInstrCxlReq property.
     * 
     * @param value
     *     allowed object is
     *     {@link CorporateActionInstructionCancellationRequestV13 }
     *     
     */
    public MxSeev04000113 setCorpActnInstrCxlReq(CorporateActionInstructionCancellationRequestV13 value) {
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
    public static MxSeev04000113 parse(String xml) {
        return ((MxSeev04000113) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxSeev04000113 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams()));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML, using the provided unmarshalling options
     * @since 9.2.6
     * 
     */
    public static MxSeev04000113 parse(String xml, MxReadConfiguration conf) {
        return ((MxSeev04000113) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxSeev04000113 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams(conf)));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxSeev04000113 parse(String xml, MxRead parserImpl) {
        return ((MxSeev04000113) parserImpl.read(MxSeev04000113 .class, xml, _classes));
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
     * Creates an MxSeev04000113 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxSeev04000113 message
     * @return
     *     a new instance of MxSeev04000113
     */
    public static final MxSeev04000113 fromJson(String json) {
        return com.prowidesoftware.swift.model.mx.AbstractMX.fromJson(json, MxSeev04000113 .class);
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
