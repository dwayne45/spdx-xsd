package main

import (
    "encoding/xml"
    "fmt"
    "io/ioutil"
    "testing"

    . "github.com/franela/goblin"
    . "github.com/onsi/gomega"
)

var testinstances = map[string]string{
    "test_instance.xml":      "xml/test_instance.xml",
}
func TestSpdxDocument(t *testing.T) {
    g := Goblin(t)
    RegisterFailHandler(func(m string, _ ...int) { g.Fail(m) })

    xf, ferr := ioutil.ReadFile(testinstances["test_instance.xml"])
    if ferr != nil {
        fmt.Printf(ferr.Error())
    }
    var spdx = NewSpdxDocument()
    err := xml.Unmarshal([]byte(xf), &spdx)
    if err != nil {
        fmt.Printf(err.Error())
    }
    g.Describe("SpdxDocument",func() {
	g.It("Must have Annotation",func() {
            Expect(spdx.Annotation.Date).To(Equal("2018-04-12T13:20:00"))
            Expect(spdx.Annotation.AnnotationTypeCode).To(Equal("AnnotationTypeOther"))
            Expect(spdx.Annotation.CommentText).To(Equal("Test string one"))
            Expect(spdx.Annotation.AnnotatorText).To(Equal("Test string one"))
        })
	g.It("Must have name",func() {
		Expect(spdx.Name).To(Equal("Test string one"))
        })
	g.It("Must have comment",func() {
		Expect(spdx.CommentText).To(Equal("Test string one"))
        })
	g.It("Must have Relationship",func() {
            Expect(spdx.Relationship.RelationshipTypeCode).To(Equal("RelationshipTypeAmendment"))
            Expect(spdx.Relationship.CommentText).To(Equal("Test string one"))
            Expect(spdx.Relationship.RelatedSpdxElement.RelationshipTypeCode).To(Equal("RelationshipTypeAmendment"))
            Expect(spdx.Relationship.RelatedSpdxElement.CommentText).To(Equal("Test string one"))
        })
	g.It("Must have CreationInfo",func() {
            Expect(spdx.CreationInfo.LicenseListVersionText).To(Equal("Test string one"))
            Expect(spdx.CreationInfo.CreatedDateTime).To(Equal("2018-04-12T13:20:00"))
            Expect(spdx.CreationInfo.CommentText).To(Equal("Test string one"))
            Expect(spdx.CreationInfo.CreatorText).To(Equal("Test string one"))
        })
	g.It("Must have specVersion",func() {
		Expect(spdx.SpecVersionText).To(Equal("Test string one"))
        })
	g.It("Must have dataLicense",func() {
		Expect(spdx.DataLicense).To(Equal("http://spdx.org/licenses/CC0-1.0"))
        })
    })

}