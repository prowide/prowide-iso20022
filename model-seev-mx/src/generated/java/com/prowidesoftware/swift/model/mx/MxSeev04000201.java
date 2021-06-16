
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
 * Class for seev.040.002.01 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "corpActnInstrCxlReq"
})
@XmlRootElement(name = "Document", namespace = "urn:swift:xsd:seev.040.002.01")
public class MxSeev04000201
    extends com.prowidesoftware.swift.model.mx.AbstractMX
{

    @XmlElement(name = "CorpActnInstrCxlReq", required = true)
    protected CorporateActionInstructionCancellationRequest002V01 corpActnInstrCxlReq;
    public final static transient String BUSINESS_PROCESS = "seev";
    public final static transient int FUNCTIONALITY = 40;
    public final static transient int VARIANT = 2;
    public final static transient int VERSION = 1;
    @SuppressWarnings("rawtypes")
    public final static transient Class[] _classes = new Class[] {AccountIdentification11 .class, AlternateIdentification2 .class, CopyDuplicate1Code.class, CorporateActionEventType4Choice.class, CorporateActionEventType6Code.class, CorporateActionGeneralInformation14 .class, CorporateActionInstructionCancellationRequest002V01 .class, CorporateActionOption4Code.class, CorporateActionOption6Choice.class, CorporateActionOption7 .class, DateAndDateTimeChoice.class, DocumentIdentification18 .class, DocumentIdentification19 .class, Extension2 .class, ExtensionEnvelope1 .class, FinancialInstrumentQuantity15Choice.class, GenericIdentification24 .class, GenericIdentification25 .class, GenericIdentification26 .class, IdentificationSource2Choice.class, InstructedOrQuantityToReceive2Choice.class, MxSeev04000201 .class, NameAndAddress12 .class, OptionNumber1Choice.class, OptionNumber1Code.class, OriginalAndCurrentQuantities4 .class, PartyIdentification16Choice.class, PartyIdentification18Choice.class, ProcessingPosition3Choice.class, ProcessingPosition3Code.class, Quantity11Choice.class, Quantity1Code.class, SafekeepingPlace1Code.class, SafekeepingPlace2Code.class, SafekeepingPlaceFormat5Choice.class, SafekeepingPlaceTypeAndAnyBICIdentifier1 .class, SafekeepingPlaceTypeAndText5 .class, SecurityIdentification12 .class, SecurityIdentification12Choice.class };
    public final static transient String NAMESPACE = "urn:swift:xsd:seev.040.002.01";

    public MxSeev04000201() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxSeev04000201(final String xml) {
        this();
        MxSeev04000201 tmp = parse(xml);
        corpActnInstrCxlReq = tmp.getCorpActnInstrCxlReq();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxSeev04000201(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the corpActnInstrCxlReq property.
     * 
     * @return
     *     possible object is
     *     {@link CorporateActionInstructionCancellationRequest002V01 }
     *     
     */
    public CorporateActionInstructionCancellationRequest002V01 getCorpActnInstrCxlReq() {
        return corpActnInstrCxlReq;
    }

    /**
     * Sets the value of the corpActnInstrCxlReq property.
     * 
     * @param value
     *     allowed object is
     *     {@link CorporateActionInstructionCancellationRequest002V01 }
     *     
     */
    public MxSeev04000201 setCorpActnInstrCxlReq(CorporateActionInstructionCancellationRequest002V01 value) {
        this.corpActnInstrCxlReq = value;
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
    public static MxSeev04000201 parse(String xml) {
        return ((MxSeev04000201) MxReadImpl.parse(MxSeev04000201 .class, xml, _classes));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxSeev04000201 parse(String xml, MxRead parserImpl) {
        return ((MxSeev04000201) parserImpl.read(MxSeev04000201 .class, xml, _classes));
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
     * Creates an MxSeev04000201 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxSeev04000201 message
     * @return
     *     a new instance of MxSeev04000201
     */
    public final static MxSeev04000201 fromJson(String json) {
        return com.prowidesoftware.swift.model.mx.AbstractMX.fromJson(json, MxSeev04000201 .class);
    }

}
